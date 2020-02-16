package lecture7.homework.language.translator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Translate {

    private String textForTranslate;
    private int code;
    private String lang;
    private List<String> text;


    public Translate(String textForTranslate, String lang) {
        this.textForTranslate = textForTranslate;
        this.lang = lang;
    }

    public Translate() {
    }


    public String getTextForTranslate() {
        return textForTranslate;
    }

    public void setTextForTranslate(String textForTranslate) {
        this.textForTranslate = textForTranslate;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }


}