/*
 * Copyright Myrrix Ltd
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

package net.myrrix.common;

import org.apache.mahout.cf.taste.impl.model.AbstractIDMigrator;

/**
 * Used when translation is needed only one-way, never back. The mappings do not need to be remembered.
 * 
 * @author Sean Owen
 * @since 1.0
 */
public final class OneWayMigrator extends AbstractIDMigrator {

  @Override
  public String toStringID(long longID) {
    throw new UnsupportedOperationException();
  }

  /**
   * Prints the hashed long value of the given string argument.
   *
   * @param args first argument is string to hash
   */
  public static void main(String[] args) {
    System.out.println(new OneWayMigrator().toLongID(args[0]));
  }

}
