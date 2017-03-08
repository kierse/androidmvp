
package com.pissiphany.repository.model;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_Post extends Post {

  private final Long userId;
  private final Long id;
  private final String title;
  private final String body;

  private AutoValue_Post(
      Long userId,
      Long id,
      String title,
      String body) {
    if (userId == null) {
      throw new NullPointerException("Null userId");
    }
    this.userId = userId;
    if (id == null) {
      throw new NullPointerException("Null id");
    }
    this.id = id;
    if (title == null) {
      throw new NullPointerException("Null title");
    }
    this.title = title;
    if (body == null) {
      throw new NullPointerException("Null body");
    }
    this.body = body;
  }

  @Override
  public Long userId() {
    return userId;
  }

  @Override
  public Long id() {
    return id;
  }

  @Override
  public String title() {
    return title;
  }

  @Override
  public String body() {
    return body;
  }

  @Override
  public String toString() {
    return "Post{"
        + "userId=" + userId + ", "
        + "id=" + id + ", "
        + "title=" + title + ", "
        + "body=" + body
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Post) {
      Post that = (Post) o;
      return (this.userId.equals(that.userId()))
           && (this.id.equals(that.id()))
           && (this.title.equals(that.title()))
           && (this.body.equals(that.body()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.userId.hashCode();
    h *= 1000003;
    h ^= this.id.hashCode();
    h *= 1000003;
    h ^= this.title.hashCode();
    h *= 1000003;
    h ^= this.body.hashCode();
    return h;
  }

  static final class Builder extends Post.Builder {
    private Long userId;
    private Long id;
    private String title;
    private String body;
    Builder() {
    }
    Builder(Post source) {
      this.userId = source.userId();
      this.id = source.id();
      this.title = source.title();
      this.body = source.body();
    }
    @Override
    public Post.Builder userId(Long userId) {
      this.userId = userId;
      return this;
    }
    @Override
    public Post.Builder id(Long id) {
      this.id = id;
      return this;
    }
    @Override
    public Post.Builder title(String title) {
      this.title = title;
      return this;
    }
    @Override
    public Post.Builder body(String body) {
      this.body = body;
      return this;
    }
    @Override
    public Post build() {
      String missing = "";
      if (userId == null) {
        missing += " userId";
      }
      if (id == null) {
        missing += " id";
      }
      if (title == null) {
        missing += " title";
      }
      if (body == null) {
        missing += " body";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_Post(
          this.userId,
          this.id,
          this.title,
          this.body);
    }
  }

}
