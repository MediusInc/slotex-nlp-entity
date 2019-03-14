package si.slotex.nlp.entity;

import java.util.Date;
import java.util.List;

/**
 * Model which contains data about the document that was processed.
 * The data is returned to the client after the processing is finnished.
 *
 * @author Mitja Kotnik
 * @version 1.0
 */
public class DocsProcessed
{

    private Integer numOfProcessed;
    private List<String> processedIds;
    private Date processStartTime;
    private Date processEndTime;

    public Integer getNumOfProcessed()
    {
        return numOfProcessed;
    }

    public void setNumOfProcessed(Integer numOfProcessed)
    {
        this.numOfProcessed = numOfProcessed;
    }

    public List<String> getProcessedIds()
    {
        return processedIds;
    }

    public void setProcessedIds(List<String> processedIds)
    {
        this.processedIds = processedIds;
    }

    public Date getProcessStartTime()
    {
        return processStartTime;
    }

    public void setProcessStartTime(Date processStartTime)
    {
        this.processStartTime = processStartTime;
    }

    public Date getProcessEndTime()
    {
        return processEndTime;
    }

    public void setProcessEndTime(Date processEndTime)
    {
        this.processEndTime = processEndTime;
    }
}
