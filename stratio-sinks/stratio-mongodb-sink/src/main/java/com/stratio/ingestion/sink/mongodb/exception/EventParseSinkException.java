/**
 * Copyright (C) 2014 Stratio (http://stratio.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stratio.ingestion.sink.mongodb.exception;

/**
 * This exception is raised whenever there is a problem with
 * {@link com.stratio.ingestion.sink.mongodb.EventParser}.
 */
public class EventParseSinkException extends RuntimeException {

    public EventParseSinkException(String message) {
        super(message);
    }

    public EventParseSinkException(Throwable cause) {
        super(cause);
    }

    public EventParseSinkException(String message, Throwable cause) {
        super(message, cause);
    }

}
