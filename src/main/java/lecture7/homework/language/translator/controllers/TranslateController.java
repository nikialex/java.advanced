package lecture7.homework.language.translator.controllers;

import lecture7.homework.language.translator.Translate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TranslateController {

    @GetMapping("/translate")
    public Translate translate(@RequestParam(value = "textForTranslate", defaultValue = " ") String textForTranslate
            , @RequestParam(value = "translateFrom", defaultValue = "") String translateFrom
            , @RequestParam(value = "translateTo", defaultValue = "") String translateTo) {

        Translate translate = new RestTemplate().getForObject(
                "https://translate.yandex.net/api/v1.5/tr.json/translate?key=trnsl.1.1.20200216T090541Z.47c10ab5c232eb11.34b9cdce59a3cac761e357d2e6d39b3af5e3c93a&text=" + textForTranslate + "&lang=" + translateFrom +
                        "-" + translateTo, Translate.class);

        translate.setTextForTranslate(textForTranslate);

        return translate;
    }

}


