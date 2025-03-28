/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.bigtable.data.v2.samples;

// [START bigtable_v2_generated_Bigtable_PingAndWarm_async]
import com.google.api.core.ApiFuture;
import com.google.bigtable.v2.InstanceName;
import com.google.bigtable.v2.PingAndWarmRequest;
import com.google.bigtable.v2.PingAndWarmResponse;
import com.google.cloud.bigtable.data.v2.BaseBigtableDataClient;

public class AsyncPingAndWarm {

  public static void main(String[] args) throws Exception {
    asyncPingAndWarm();
  }

  public static void asyncPingAndWarm() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (BaseBigtableDataClient baseBigtableDataClient = BaseBigtableDataClient.create()) {
      PingAndWarmRequest request =
          PingAndWarmRequest.newBuilder()
              .setName(InstanceName.of("[PROJECT]", "[INSTANCE]").toString())
              .setAppProfileId("appProfileId704923523")
              .build();
      ApiFuture<PingAndWarmResponse> future =
          baseBigtableDataClient.pingAndWarmCallable().futureCall(request);
      // Do something.
      PingAndWarmResponse response = future.get();
    }
  }
}
// [END bigtable_v2_generated_Bigtable_PingAndWarm_async]
