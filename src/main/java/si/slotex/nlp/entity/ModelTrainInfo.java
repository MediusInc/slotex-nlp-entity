package si.slotex.nlp.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Model which contains data about each training of a entity. It is persisted into the MongoDB.
 *
 * @author Mitja Kotnik
 * @version 1.0
 */
@Document
public class ModelTrainInfo
{

    @Id
    private Long versionName;
    private Date timeStamp;
    private String modelName;
    private String trainDataFile;
    private List<String> additionalTrainData;

    public Long getVersionName()
    {
        return versionName;
    }

    public void setVersionName(Long versionName)
    {
        this.versionName = versionName;
    }

    public Date getTimeStamp()
    {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp)
    {
        this.timeStamp = timeStamp;
    }

    public String getModelName()
    {
        return modelName;
    }

    public void setModelName(String modelName)
    {
        this.modelName = modelName;
    }

    public String getTrainDataFile()
    {
        return trainDataFile;
    }

    public void setTrainDataFile(String trainDataFile)
    {
        this.trainDataFile = trainDataFile;
    }

    public List<String> getAdditionalTrainData()
    {
        return additionalTrainData;
    }

    public void setAdditionalTrainData(List<String> additionalTrainData)
    {
        this.additionalTrainData = additionalTrainData;
    }
}
