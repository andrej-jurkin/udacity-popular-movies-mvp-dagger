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

package jurkin.popularmovies.ui.discovery;

import android.os.Bundle;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import jurkin.popularmovies.R;
import jurkin.popularmovies.base.BaseActivity;

/**
 * Created by ajurkin on 5/13/17.
 */
public class DiscoveryActivity extends BaseActivity {

    @Inject
    DiscoveryFragment discoveryFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discovery);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(
                    R.id.fragmentContainer, discoveryFragment).commit();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
