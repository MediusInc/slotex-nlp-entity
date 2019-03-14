package si.slotex.nlp.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Model which contains detailed data about the document. It is used for basic training of
 * existing and new models.
 *
 * @author Mitja Kotnik
 * @version 1.0
 */
@Document
public class DocTag
{
    @Id
    private String documentId;
    private String modelsToTrain;
    private String title;
    private String language;
    private Double languageProb;
    private Integer numOfSentences;
    private List<Sentence> sentences;

    public String getDocumentId()
    {
        return documentId;
    }

    public void setDocumentId(String documentId)
    {
        this.documentId = documentId;
    }

    public String getModelsToTrain()
    {
        return modelsToTrain;
    }

    public void setModelsToTrain(String modelsToTrain)
    {
        this.modelsToTrain = modelsToTrain;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
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

    public List<Sentence> getSentences()
    {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences)
    {
        this.sentences = sentences;
    }

    @Override
    public String toString()
    {
        return "DocTag{" +
                "documentId=" + documentId +
                ", modelsToTrain='" + modelsToTrain + '\'' +
                ", title='" + title + '\'' +
                ", language='" + language + '\'' +
                ", languageProb=" + languageProb +
                ", numOfSentences=" + numOfSentences +
                ", sentences=" + sentences +
                '}';
    }
}
