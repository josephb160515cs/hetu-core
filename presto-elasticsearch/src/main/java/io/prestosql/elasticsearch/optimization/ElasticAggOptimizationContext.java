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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.prestosql.spi.plan.AggregationNode;
import io.prestosql.spi.plan.Symbol;

import java.util.List;
import java.util.Map;

public class ElasticAggOptimizationContext
{
    private List<Symbol> groupingKeys;
    private Map<Symbol, AggregationNode.Aggregation> aggregations;

    @JsonProperty
    public Map<Symbol, AggregationNode.Aggregation> getAggregations()
    {
        return aggregations;
    }

    @JsonProperty
    public List<Symbol> getGroupingKeys()
    {
        return groupingKeys;
    }

    @JsonCreator
    public ElasticAggOptimizationContext(
            @JsonProperty("aggregations") Map<Symbol, AggregationNode.Aggregation> aggregations,
            @JsonProperty("groupingKeys") List<Symbol> groupingKeys)
    {
        this.aggregations = aggregations;
        this.groupingKeys = groupingKeys;
    }
}
