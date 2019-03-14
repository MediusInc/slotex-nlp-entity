package si.slotex.nlp.entity;

import java.util.List;

/**
 * Model which contains metadata about a specific document that was tagged.
 *
 * @author Mitja Kotnik
 * @version 1.0
 */
public class TaggedData
{
    private String documentId;
    private String language;
    private Double languageProb;
    private Integer numOfSentences;
    private Integer numOfTokens;
    private Integer numOfEntities;
    private List<Entity> entities;

    public String getDocumentId()
    {
        return documentId;
    }

    public void setDocumentId(String documentId)
    {
        this.documentId = documentId;
    }

    public String getLanguage()
    {
        return language;
    }

    public void setLanguage(String language)
    {
        this.language = language;
    }

    public Double getLanguageProb()
    {
        return languageProb;
    }

    public void setLanguageProb(Double languageProb)
    {
        this.languageProb = languageProb;
    }

    public Integer getNumOfSentences()
    {
        return numOfSentences;
    }

    public void setNumOfSentences(Integer numOfSentences)
    {
        this.numOfSentences = numOfSentences;
    }

    public Integer getNumOfTokens()
    {
        return numOfTokens;
    }

    public void setNumOfTokens(Integer numOfTokens)
    {
        this.numOfTokens = numOfTokens;
    }

    public Integer getNumOfEntities()
    {
        return numOfEntities;
    }

    public void setNumOfEntities(Integer numOfEntities)
    {
        this.numOfEntities = numOfEntities;
    }

    public List<Entity> getEntities()
    {
        return entities;
    }

    public void setEntities(List<Entity> entities)
    {
        this.entities = entities;
    }
}
