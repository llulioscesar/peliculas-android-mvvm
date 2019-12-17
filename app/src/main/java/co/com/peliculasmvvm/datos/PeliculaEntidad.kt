package co.com.peliculasmvvm.datos

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "pelicula")
class PeliculaEntidad (

    @PrimaryKey
    @SerializedName("id")
    @Expose
    var id: Int,

    @SerializedName("popularity")
    @Expose
    var popularity: Double,

    @SerializedName("vote_count")
    @Expose
    var vote_count: Int,

    @SerializedName("video")
    @Expose
    var video: Boolean,

    @SerializedName("poster_path")
    @Expose
    var poster_path: String,

    @SerializedName("adult")
    @Expose
    var adult: Boolean,

    @SerializedName("backdrop_path")
    @Expose
    var backdrop_path: String,

    @SerializedName("original_language")
    @Expose
    var original_language: String,

    @SerializedName("original_title")
    @Expose
    var original_title: String,

    @SerializedName("genre_ids")
    @Expose
    var genre_ids: IntArray,

    @SerializedName("title")
    @Expose
    var title: String,

    @SerializedName("vote_average")
    @Expose
    var vote_average: Double,

    @SerializedName("overview")
    @Expose
    var overview: String,

    @SerializedName("release_date")
    @Expose
    var release_date: String
)