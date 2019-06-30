package com.kaansonmezoz.thymeleaf.htmlmapping.service;

import com.kaansonmezoz.thymeleaf.htmlmapping.model.ViewModel;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.StringTemplateResolver;

public class TemplateEngineService {
    @Bean
    public TemplateEngine getTemplateEngine(StringTemplateResolver resolver){
        TemplateEngine engine = new TemplateEngine();
        engine.setTemplateResolver(resolver);

        return engine;
    }

    @Bean
    public StringTemplateResolver getTemplateResolver(){
        StringTemplateResolver resolver = new StringTemplateResolver();
        resolver.setTemplateMode(TemplateMode.HTML);

        return resolver;
    }

    public String mapHtmlString(String html, ViewModel viewModel){
        Context context = new Context();
        context.setVariable("Model", viewModel);

        String mappedHtml = getTemplateEngine(getTemplateResolver()).process(html, context);

        return mappedHtml;
    }
}
