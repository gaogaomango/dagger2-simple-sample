package com.nangokuman.dagger2mysample;

import dagger.Module;
import dagger.Provides;

@Module
public class SampleModule {

    @Provides
    Sample provideSampleImpl() {
        return new SampleImpl();
    }
}
