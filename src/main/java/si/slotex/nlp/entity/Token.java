package si.slotex.nlp.entity;

/**
 * Model which contains data about each word that is used in a sentence.
 *
 * @author Mitja Kotnik
 * @version 1.0
 */
public class Token
{

    private String word;
    private String posTag;
    private String lemma;
    private String nerTag;

    public String getWord()
    {
        return word;
    }

    public void setWord(String word)
    {
        this.word = word;
    }

    public String getPosTag()
    {
        return posTag;
    }

    public void setPosTag(String posTag)
    {
        this.posTag = posTag;
    }

    public String getLemma()
    {
        return lemma;
    }

    public void setLemma(String lemma)
    {
        this.lemma = lemma;
    }

    public String getNerTag()
    {
        return nerTag;
    }

    public void setNerTag(String nerTag)
    {
        this.nerTag = nerTag;
    }
}
