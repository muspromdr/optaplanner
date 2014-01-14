/*
 * Copyright 2013 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.benchmark.impl.statistic.bestsolutionmutation;

import java.util.List;

import org.optaplanner.benchmark.impl.statistic.StatisticPoint;

public class BestSolutionMutationStatisticPoint extends StatisticPoint {

    private final long timeMillisSpend;
    private final int mutationCount;

    public BestSolutionMutationStatisticPoint(long timeMillisSpend, int mutationCount) {
        this.timeMillisSpend = timeMillisSpend;
        this.mutationCount = mutationCount;
    }

    public long getTimeMillisSpend() {
        return timeMillisSpend;
    }

    public int getMutationCount() {
        return mutationCount;
    }

    @Override
    public List<String> toCsvLine() {
        return buildCsvLineWithLongs(timeMillisSpend, mutationCount);
    }

}
