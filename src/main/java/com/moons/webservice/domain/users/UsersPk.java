package com.moons.webservice.domain.users;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UsersPk implements Serializable {

    private Long no;

    private String userId;

    public Long getNo() {
        return no;
    }

    public void setNo(Long no) {
        this.no = no;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UsersPk(Long no, String userId){
        this.no = no;
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersPk usersPk = (UsersPk) o;
        return Objects.equals(no, usersPk.no) &&
                Objects.equals(userId, usersPk.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, userId);
    }
}
