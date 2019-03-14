package si.slotex.nlp.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

/**
 * Model which contains data about document provided for MediusNLP processing.
 * This document data is being persisted to the Redis queue where it is then processed by MediusNLP framework.
 *
 * @author Mitja Kotnik
 * @version 1.0
 */
@RedisHash("document")
public class Document implements Serializable
{
    @Id
    private String documentId;
    @Indexed
    private Date insertDate;
    private String title;
    private String content;

    public String getDocumentId()
    {
        return documentId;
    }

    public void setDocumentId(String documentId)
    {
        this.documentId = documentId;
    }

    public Date getInsertDate()
    {
        return insertDate;
    }

    public void setInsertDate(Date insertDate)
    {
        this.insertDate = insertDate;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }
}
