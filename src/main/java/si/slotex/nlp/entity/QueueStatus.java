package si.slotex.nlp.entity;

import java.util.List;

/**
 * Model which contains data about the documents that are in the processing queue.
 * The processing queue are our Redis queues for wait and work data.
 *
 * @author Mitja Kotnik
 * @version 1.0
 */
public class QueueStatus
{

    private Long waitQueueSize;
    private Long workQueueSize;
    private List<String> waitDocumentIds;
    private List<String> workDocumentIds;

    public Long getWaitQueueSize()
    {
        return waitQueueSize;
    }

    public void setWaitQueueSize(Long waitQueueSize)
    {
        this.waitQueueSize = waitQueueSize;
    }

    public Long getWorkQueueSize()
    {
        return workQueueSize;
    }

    public void setWorkQueueSize(Long workQueueSize)
    {
        this.workQueueSize = workQueueSize;
    }

    public List<String> getWaitDocumentIds()
    {
        return waitDocumentIds;
    }

    public void setWaitDocumentIds(List<String> waitDocumentIds)
    {
        this.waitDocumentIds = waitDocumentIds;
    }

    public List<String> getWorkDocumentIds()
    {
        return workDocumentIds;
    }

    public void setWorkDocumentIds(List<String> workDocumentIds)
    {
        this.workDocumentIds = workDocumentIds;
    }
}
