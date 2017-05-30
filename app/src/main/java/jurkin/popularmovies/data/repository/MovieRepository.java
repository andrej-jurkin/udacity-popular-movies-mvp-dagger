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

import android.support.annotation.NonNull;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import jurkin.popularmovies.data.model.Movie;
import jurkin.popularmovies.data.model.MovieDetails;
import jurkin.popularmovies.data.model.MovieReview;
import jurkin.popularmovies.data.model.Video;
import jurkin.popularmovies.data.repository.local.MovieLocalDataSource;
import jurkin.popularmovies.data.repository.remote.MovieRemoteDataSource;
import rx.Observable;

/**
 * Created by ajurkin on 5/28/17.
 */

@Singleton
public final class MovieRepository implements MovieDataSource {

    private MovieRemoteDataSource remoteDataSource;
    private MovieLocalDataSource localDataSource;

    @Inject
    MovieRepository(MovieRemoteDataSource remoteDataSource,
                    MovieLocalDataSource localDataSource) {
        this.remoteDataSource = remoteDataSource;
        this.localDataSource = localDataSource;
    }


    @Override
    @NonNull
    public Observable<List<Movie>> getPopularMovies() {
        return remoteDataSource.getPopularMovies();
    }

    @Override
    @NonNull
    public Observable<List<Movie>> getTopRatedMovies() {
        return remoteDataSource.getTopRatedMovies();
    }

    @Override
    @NonNull
    public Observable<MovieDetails> getMovieDetails(long movieId) {
        return remoteDataSource.getMovieDetails(movieId);
    }

    @Override
    @NonNull
    public Observable<List<Video>> getVideos(long movieId) {
        return remoteDataSource.getVideos(movieId);
    }

    @Override
    @NonNull
    public Observable<List<MovieReview>> getReviews(long movieId) {
        return null;
    }
}