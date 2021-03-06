package com.piedcard.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.io.Serializable;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(tableName = "card",
        foreignKeys = @ForeignKey(entity = Deck.class,
                parentColumns = "id",
                childColumns  = "id_deck",
                onDelete = CASCADE))
public class Card implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private Long id;
    @NonNull
    private String front;
    @NonNull
    private String back;
    private boolean favorite;
    @Ignore
    private boolean face;
    @ColumnInfo(name = "id_deck", index = true)
    private Long idDeck;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NonNull
    public String getFront() {
        return front;
    }

    public void setFront(@NonNull String front) {
        this.front = front;
    }

    @NonNull
    public String getBack() {
        return back;
    }

    public void setBack(@NonNull String back) {
        this.back = back;
    }

    public Long getIdDeck() {
        return idDeck;
    }

    public void setIdDeck(Long idDeck) {
        this.idDeck = idDeck;
    }

    public boolean isFace() {
        return face;
    }

    public void setFace(boolean face) {
        this.face = face;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
