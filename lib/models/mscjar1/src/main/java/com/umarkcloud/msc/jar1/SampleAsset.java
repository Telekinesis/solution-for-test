/*
 * Licensed Materials - Property of UMARK
 * THIS MODULE IS "RESTRICTED MATERIALS OF UMARK"
 * (c) Copyright UMARK Inc. 2018 All Rights Reserved
 *
 * The source code for this program is not published or
 * otherwise divested of its trade secrets
 */

package com.umarkcloud.msc.jar1;

import com.umarkcloud.oboe.model.User;
import org.hyperledger.composer.annotation.Asset;
import org.hyperledger.composer.annotation.DataField;
import org.hyperledger.composer.annotation.Pointer;

@Asset
public class SampleAsset {

  @DataField(primary = true)
  public String id;

  @Pointer
  public User user;
}
