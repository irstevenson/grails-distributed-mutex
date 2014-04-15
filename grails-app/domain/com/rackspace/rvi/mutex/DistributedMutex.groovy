/*
 * Copyright 2014 Bud Byrd
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
package com.rackspace.rvi.mutex

class DistributedMutex {
    /**
     * Mutex key.
     */
    String keyValue

    /**
     * Whether the mutex is locked.
     */
    boolean locked = false

    /**
     * Timestamp when the mutex was last modified.
     */
    Date lastUpdated

    /**
     * Field constraints.
     */
    static constraints = {
        keyValue unique: true, nullable: false, blank: false
        lastUpdated nullable: true
    }
}
