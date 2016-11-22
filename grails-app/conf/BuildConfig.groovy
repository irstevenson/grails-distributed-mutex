/**
 * Copyright 2015 Bud Byrd
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
grails.project.work.dir = "target"

grails.project.dependency.resolver = "maven" // or ivy
grails.project.dependency.resolution = {
    inherits "global"
    log "warn"
    checksums true
    legacyResolve false

    repositories {
        grailsPlugins()
        grailsHome()
        mavenLocal()
        grailsCentral()
        mavenCentral()
    }

    dependencies {
        test('org.objenesis:objenesis:2.1') {
            export = false
        }

        compile( "org.springframework:spring-orm:$springVersion" ) {
            export = false
        }
    }

    plugins {
        build(":release:3.1.1", ":rest-client-builder:1.0.3") {
            export = false
        }

        runtime ":hibernate4:4.3.5.3", {
            export = false
        }

        test(":code-coverage:1.2.7") {
            export = false
        }
    }
}