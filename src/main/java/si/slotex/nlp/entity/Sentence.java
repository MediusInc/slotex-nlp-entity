package si.slotex.nlp.entity;

import java.util.List;

/**
 * Model which contains data for each sentence that is included in document.
 *
 * @author Mitja Kotnik
 * @version 1.0
 */
public class Sentence
{

    private String sentence;
    private Integer numberOfTokens;
    private List<Token> tokens;

    public String getSentence()
    {
        return sentence;
    }

    public void setSentence(String sentence)
    {
        this.sentence = sentence;
    }

    public Integer getNumberOfTokens()
    {
        return numberOfTokens;
    }

    public void setNumberOfTokens(Integer numberOfTokens)
    {
        this.numberOfTokens = numberOfTokens;
    }

    public List<Token> getTokens()
    {
        return tokens;
    }

    public void setTokens(List<Token> tokens)
    {
        this.tokens = tokens;
    }
}
