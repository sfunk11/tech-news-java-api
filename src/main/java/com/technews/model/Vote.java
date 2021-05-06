package com.technews.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "vote")




public class Vote implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int userId;
    private int postId;

    public Vote() {
    }

    public Vote(int id, int userId, int postId) {
        this.id = id;
        this.userId = userId;
        this.postId = postId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vote)) return false;
        Vote vote = (Vote) o;
        return getId() == vote.getId() && getUserId() == vote.getUserId() && getPostId() == vote.getPostId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUserId(), getPostId());
    }

    @Override
    public String toString() {
        return "Vote{" +
                "id=" + id +
                ", userId=" + userId +
                ", postId=" + postId +
                '}';
    }
}
