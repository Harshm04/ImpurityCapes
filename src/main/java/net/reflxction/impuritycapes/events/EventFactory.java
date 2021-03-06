/*
 * * Copyright 2018 github.com/ReflxctionDev
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
package net.reflxction.impuritycapes.events;

import net.minecraftforge.common.MinecraftForge;

/**
 * Class which handles event posting
 */
public class EventFactory {

    /**
     * Fired when the API key has been set
     *
     * @param key the API key
     */
    public static void onKeySet(String key) {
        KeySetEvent event = new KeySetEvent(key);
        MinecraftForge.EVENT_BUS.post(event);
    }
}
