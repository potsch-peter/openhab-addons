/**
 * Copyright 2017-2018 Gregory Moyer and contributors.
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
package org.openhab.binding.lametrictime.api.model.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.openhab.binding.lametrictime.api.model.enums.SoundCategory;

public class SoundCategoryTest
{
    @Test
    public void testConversion()
    {
        for (SoundCategory value : SoundCategory.values())
        {
            assertEquals(value, SoundCategory.toEnum(value.toRaw()));
        }
    }

    @Test
    public void testInvalidRawValue()
    {
        assertNull(SoundCategory.toEnum("invalid raw value"));
    }

    @Test
    public void testNullRawValue()
    {
        assertNull(SoundCategory.toEnum(null));
    }
}
