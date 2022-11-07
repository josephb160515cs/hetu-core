/*
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
package io.prestosql.elasticsearch.optimization;

import io.prestosql.spi.plan.AggregationNode;
import io.prestosql.spi.plan.Symbol;

import java.util.List;
import java.util.Map;

public class ElasticAggregationBuilder
{
    private ElasticAggregationBuilder()
    {
    }

    public static boolean isOptimizationSupported(Map<Symbol, AggregationNode.Aggregation> aggregations, List<Symbol> groupingKeys)
    {
        /*aggregations.entrySet().stream().map(Map.Entry::getValue).allMatch(aggregation -> aggregation.ge);*/
        return false;
    }
}
