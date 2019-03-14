package si.slotex.nlp.entity;

import si.slotex.nlp.entity.enums.DiffStatus;

/**
 * Model which contains detailed data about each token that was tagged with stat and dict NER.
 *
 * @author Mitja Kotnik
 * @version 1.0
 */
public class CorpusTokenDiff
{

    private Boolean modelCheck;
    private String token;
    private DiffStatus status;

    public Boolean getModelCheck()
    {
        return modelCheck;
    }

    public void setModelCheck(Boolean modelCheck)
    {
        this.modelCheck = modelCheck;
    }

    public String getToken()
    {
        return token;
    }

    public void setToken(String token)
    {
        this.token = token;
    }

    public DiffStatus getStatus()
    {
        return status;
    }

    public void setStatus(DiffStatus status)
    {
        this.status = status;
    }
}
