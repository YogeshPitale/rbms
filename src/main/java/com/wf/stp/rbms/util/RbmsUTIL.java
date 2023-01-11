package com.wf.stp.rbms.util;

import com.wf.stp.rbms.router.RuleService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AssignableTypeFilter;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

@Slf4j
public class RbmsUTIL {

    public static List<Class<?>> findAllRoutingClasses(String packageName) {
        final List<Class<?>> result = new LinkedList<Class<?>>();
        final ClassPathScanningCandidateComponentProvider provider =
                new ClassPathScanningCandidateComponentProvider(false);
        provider.addIncludeFilter(new AssignableTypeFilter(RuleService.class));
        for (BeanDefinition beanDefinition : provider.findCandidateComponents(packageName)) {
            try {
                Class<?> clazz = Class.forName(beanDefinition.getBeanClassName());
                Class<?>[] interfaces = clazz.getInterfaces();
                for (Class<?> _interface : interfaces) {
                    if (_interface.getSimpleName().equalsIgnoreCase(RuleService.class.getSimpleName()))
                        result.add(clazz);
                }
            } catch (ClassNotFoundException e) {
                log.warn("Could not resolve class object for bean definition", e);
            }
        }
        result.stream().forEach(r -> log.info(r.getSimpleName()));
        return result;
    }
}
