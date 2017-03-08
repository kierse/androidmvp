package com.pissiphany.repository.model;

import com.google.auto.value.AutoValue;

/**
 * Created by kierse on 2016-07-17.
 */
@AutoValue
public abstract class Post {
    public abstract Long userId();
    public abstract Long id();
    public abstract String title();
    public abstract String body();

    public static Builder builder() {
        return new AutoValue_Post.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder userId(Long userId);
        public abstract Builder id(Long id);
        public abstract Builder title(String title);
        public abstract Builder body(String body);

        public abstract Post build();
    }
}
