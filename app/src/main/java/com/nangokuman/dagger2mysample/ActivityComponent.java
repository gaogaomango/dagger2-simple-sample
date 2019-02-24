package com.nangokuman.dagger2mysample;

import dagger.Component;

@Component(modules = SampleModule.class)
public interface ActivityComponent {
    void inject(MainActivity activity);
}
