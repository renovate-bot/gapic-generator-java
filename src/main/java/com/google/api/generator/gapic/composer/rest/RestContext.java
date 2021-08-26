// Copyright 2021 Google LLC
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

package com.google.api.generator.gapic.composer.rest;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonCallableFactory;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.httpjson.ProtoOperationTransformers;
import com.google.api.gax.httpjson.longrunning.OperationsClient;
import com.google.api.gax.httpjson.longrunning.stub.HttpJsonOperationsStub;
import com.google.api.generator.gapic.composer.common.TransportContext;
import com.google.api.generator.gapic.composer.utils.ClassNames;
import com.google.api.generator.gapic.model.Transport;

public abstract class RestContext extends TransportContext {
  private static final TransportContext INSTANCE =
      RestContext.builder()
          .setClassNames(new ClassNames("HttpJson"))
          .setTransport(Transport.REST)
          .setTransportName("REST")
          // For httpjson.HttpJsonServiceStubClassComposer
          .setCallSettingsClass(HttpJsonCallSettings.class)
          .setStubCallableFactoryType(classToType(HttpJsonStubCallableFactory.class))
          .setMethodDescriptorClass(ApiMethodDescriptor.class)
          .setTransportOperationsStubType(classToType(HttpJsonOperationsStub.class))
          .setTransportOperationsStubName("httpJsonOperationsStub")
          // For httpjson.ServiceSettingsClassComposer
          .setInstantiatingChannelProviderClass(InstantiatingHttpJsonChannelProvider.Builder.class)
          .setDefaultTransportProviderBuilderName("defaultHttpJsonTransportProviderBuilder")
          // For httpjson.ServiceStubSettingsClassComposer
          .setTransportChannelType(classToType(HttpJsonTransportChannel.class))
          .setTransportGetterName("getHttpJsonTransportName")
          // For httpjson.HttpJsonServiceCallableFactoryClassComposer
          .setTransportCallSettingsType(classToType(HttpJsonCallSettings.class))
          .setTransportCallableFactoryType(classToType(HttpJsonCallableFactory.class))
          // TODO: set to com.google.api.gax.httpjson.longrunning.stub.OperationsStub.class
          .setOperationsStubType(classToType(BackgroundResource.class))
          .setTransportCallSettingsName("httpJsonCallSettings")
          // For RetrySettingsComposer
          .setOperationResponseTransformerType(
              classToType(ProtoOperationTransformers.ResponseTransformer.class))
          .setOperationMetadataTransformerType(
              classToType(ProtoOperationTransformers.MetadataTransformer.class))
          // For ServiceClientClassComposer
          .setOperationsClientType(classToType(OperationsClient.class))
          .setOperationsClientName("httpJsonOperationsClient")
          .build();

  public static TransportContext instance() {
    return INSTANCE;
  }
}
