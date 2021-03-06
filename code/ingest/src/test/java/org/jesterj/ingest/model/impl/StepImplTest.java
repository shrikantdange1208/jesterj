/*
 * Copyright 2016 Needham Software LLC
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

package org.jesterj.ingest.model.impl;
/*
 * Created with IntelliJ IDEA.
 * User: gus
 * Date: 3/17/16
 */

import com.copyright.easiertest.Mock;
import com.copyright.easiertest.ObjectUnderTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.copyright.easiertest.EasierMocks.*;

public class StepImplTest {

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }

  @Test
  public void testBuildAStep() {
    StepImpl.Builder builder = new StepImpl.Builder();
    builder.batchSize(5);
    StepImpl built = builder.build();
  }

}
