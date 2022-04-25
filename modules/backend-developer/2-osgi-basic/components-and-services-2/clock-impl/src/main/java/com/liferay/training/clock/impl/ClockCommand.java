package com.liferay.training.clock.impl;

import com.liferay.training.clock.api.api.ClockApi;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
        property = {
                "osgi.command.function=telltime",
                "osgi.command.scope=training"
        },
        service = ClockCommand.class
)
public class ClockCommand {

    public void telltime() {
        System.out.println(clock.getTime());
    }

    @Reference
    private ClockApi clock;
}