/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.runtime.core.internal.policy;

import org.mule.runtime.core.api.processor.Processor;

public class OperationPolicyProcessorTestCase extends AbstractPolicyProcessorTestCase {

  @Override
  protected Processor getProcessor() {
    return new OperationPolicyProcessor(policy, policyStateHandler, flowProcessor);
  }
}