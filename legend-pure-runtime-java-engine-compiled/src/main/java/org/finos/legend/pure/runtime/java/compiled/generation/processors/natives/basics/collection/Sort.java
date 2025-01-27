// Copyright 2020 Goldman Sachs
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.finos.legend.pure.runtime.java.compiled.generation.processors.natives.basics.collection;

import org.eclipse.collections.api.list.ListIterable;
import org.finos.legend.pure.m4.coreinstance.CoreInstance;
import org.finos.legend.pure.runtime.java.compiled.generation.ProcessorContext;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.natives.AbstractNativeFunctionGeneric;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.CompiledSupport;

public class Sort extends AbstractNativeFunctionGeneric
{
    public Sort() {
        super(getMethod(CompiledSupport.class, "toSorted"), false, true, false, "sort_T_m__Function_$0_1$__Function_$0_1$__T_m_");
    }

    @Override
    public String build(CoreInstance topLevelElement, CoreInstance functionExpression, ListIterable<String> transformedParams, ProcessorContext processorContext)
    {
        return "CompiledSupport.toSorted("
                + transformedParams.get(0) + ", " +
                "PureCompiledLambda.getPureFunction(" + transformedParams.get(1) + ",es), " +
                "PureCompiledLambda.getPureFunction(" + transformedParams.get(2) + ",es)," +
                "es)";
    }
}
