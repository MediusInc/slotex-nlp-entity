package si.slotex.nlp.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Model which contains data about each new entity found for a word.
 * We have basic types of entities [person, organization, location].
 *
 * @author Mitja Kotnik
 * @version 1.0
 */
@Document
public class Entity
{
    @Id
    private Long id;
    private String word;
    private String type;
    private List<String> documentIds;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getWord()
    {
        return word;
    }

    public void setWord(String word)
    {
        this.word = word;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public List<String> getDocumentIds()
    {
        return documentIds;
    }

    public void setDocumentIds(List<String> documentIds)
    {
        this.documentIds = documentIds;
    }

    @Override
    public String toString()
    {
        return "Entity{" +
                "id=" + id +
                ", word='" + word + '\'' +
                ", type='" + type + '\'' +
                ", documentIds=" + documentIds +
                '}';
    }
}
