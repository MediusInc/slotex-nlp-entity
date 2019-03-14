package si.slotex.nlp.entity;

import java.util.List;

/**
 * Model which contains additional data for training specified models
 *
 * @author Mitja Kotnik
 * @version 1.0
 */
public class DocTrain
{

    private String modelsToTrain;
    private String language;
    private Integer numOfSentences;
    private List<Sentence> trainSentences;

    public String getModelsToTrain()
    {
        return modelsToTrain;
    }

    public void setModelsToTrain(String modelsToTrain)
    {
        this.modelsToTrain = modelsToTrain;
    }

    public String getLanguage()
    {
        return language;
    }

    public void setLanguage(String language)
    {
        this.language = language;
    }

    public Integer getNumOfSentences()
    {
        return numOfSentences;
    }

    public void setNumOfSentences(Integer numOfSentences)
    {
        this.numOfSentences = numOfSentences;
    }

    public List<Sentence> getTrainSentences()
    {
        return trainSentences;
    }

    public void setTrainSentences(List<Sentence> trainSentences)
    {
        this.trainSentences = trainSentences;
    }
}
