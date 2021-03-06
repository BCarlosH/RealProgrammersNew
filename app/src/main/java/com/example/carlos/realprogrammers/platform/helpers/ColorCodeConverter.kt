package com.example.carlos.realprogrammers.platform.helpers

import com.example.carlos.realprogrammers.R
import com.example.carlos.realprogrammers.domain.entities.RatingLevel

/**
 * 20170903. Initial version created by jorge
 * for a Canonical Examples training.
 *
 * Copyright 2017 Jorge D. Ortiz Fuentes
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

fun getColorId(colorCode: Int): Int = when (colorCode) {
    RatingLevel.COLOR_BEST -> R.color.colorBest
    RatingLevel.COLOR_GOOD -> R.color.colorGood
    RatingLevel.COLOR_AVERAGE -> R.color.colorAverage
    RatingLevel.COLOR_BAD -> R.color.colorBad
    else -> R.color.colorWorst
}
