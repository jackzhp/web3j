/*
 * Copyright 2019 Web3 Labs Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.web3j.abi.datatypes;

import java.util.List;

/** Dynamic array type. */
public class DynamicArray<T extends Type<?>> extends Array<T> {

    public DynamicArray(final Class<T> type, final List<T> values) {
        super(type, values);
    }

    @SafeVarargs
    public DynamicArray(final Class<T> type, final T... values) {
        super(type, values);
    }

    @Override
    public String getTypeAsString() {
        return AbiTypes.getTypeAString(getComponentType()) + "[]";
    }
}
