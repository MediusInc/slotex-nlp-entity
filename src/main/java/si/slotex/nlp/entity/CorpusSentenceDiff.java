package si.slotex.nlp.entity;

import java.math.BigInteger;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Model which contains detailed data about each sentence that was tagged with stat and dict NER.
 *
 * @author Mitja Kotnik
 * @version 1.0
 */
@Document
public class CorpusSentenceDiff
{

    @Id
    private BigInteger sentenceDiffId;
    private Date tagDate;
    private String model;
    private Integer corpusLine;
    private String sentence;
    private Boolean diff;
    private Boolean edit;

    public BigInteger getSentenceDiffId()
    {
        return sentenceDiffId;
    }

    public void setSentenceDiffId(BigInteger sentenceDiffId)
    {
        this.sentenceDiffId = sentenceDiffId;
    }

    public Date getTagDate()
    {
        return tagDate;
    }

    public void setTagDate(Date tagDate)
    {
        this.tagDate = tagDate;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public Integer getCorpusLine()
    {
        return corpusLine;
    }

    public void setCorpusLine(Integer corpusLine)
    {
        this.corpusLine = corpusLine;
    }

    public String getSentence()
    {
        return sentence;
    }

    public void setSentence(String sentence)
    {
        this.sentence = sentence;
    }

    public Boolean getDiff()
    {
        return diff;
    }

    public void setDiff(Boolean diff)
    {
        this.diff = diff;
    }

    public Boolean getEdit()
    {
        return edit;
    }

    public void setEdit(Boolean edit)
    {
        this.edit = edit;
    }

    @Override
    public String toString()
    {
        return "CorpusSentenceDiff{" +
                "sentenceDiffId=" + sentenceDiffId +
                ", entity='" + model + '\'' +
                ", corpusLine=" + corpusLine +
                ", sentence='" + sentence + '\'' +
                ", diff=" + diff +
                ", edit=" + edit +
                '}';
    }
}
