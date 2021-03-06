/*
 * Copyright 2017 Andrej Jurkin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jurkin.popularmovies.data.repository;

import java.util.List;

import jurkin.popularmovies.data.model.Movie;
import jurkin.popularmovies.data.model.MovieReview;
import jurkin.popularmovies.data.model.Video;
import rx.Observable;

/**
 * Created by Andrej Jurkin on 5/28/17.
 */

public interface MovieDataSource {

    Observable<List<Movie>> getPopularMovies();

    Observable<List<Movie>> getTopRatedMovies();

    Observable<Movie> getMovie(long movieId);

    Observable<List<Video>> getVideos(long movieId);

    Observable<List<MovieReview>> getReviews(long movieId);

    Observable<List<Movie>> getWatchlist();

    Observable<Void> addToWatchlist(long movieId);

    Observable<Void> removeFromWatchlist(long movieId);

    Observable<Void> saveMovies(List<Movie> movies);

    Observable<Void> saveMovie(Movie movie);

    Observable<Void> saveReviews(List<MovieReview> reviews);

    Observable<Void> saveReview(MovieReview review);

    Observable<Void> saveVideos(List<Video> videos);

    Observable<Void> saveVideo(Video video);
}
