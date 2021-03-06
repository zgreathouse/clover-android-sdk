/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2016 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.customers;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * Represents a customer that is linked to an external system.  This customer may be persisted in Clover, or it may not.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getCustomer customer}</li>
 * <li>{@link #getDisplayString displayString}</li>
 * <li>{@link #getExternalId externalId}</li>
 * <li>{@link #getExternalSystemName externalSystemName}</li>
 * <li>{@link #getExtras extras}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class CustomerInfo extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * The customer object that Clover uses.  This is the base model for a Clover customer, any additional information external systems need should exist in other fields
   */
  public com.clover.sdk.v3.customers.Customer getCustomer() {
    return genClient.cacheGet(CacheKey.customer);
  }

  /**
   * A custom way to display this customer for an external system
   */
  public java.lang.String getDisplayString() {
    return genClient.cacheGet(CacheKey.displayString);
  }

  /**
   * an id for an external system to use to reference this Customer.
   */
  public java.lang.String getExternalId() {
    return genClient.cacheGet(CacheKey.externalId);
  }

  /**
   * The name of the external system that 'owns' this.  It is the system that understands the link from the externalId to the Customer.
   */
  public java.lang.String getExternalSystemName() {
    return genClient.cacheGet(CacheKey.externalSystemName);
  }

  /**
   * Extra data used by external systems.
   */
  public java.util.Map<java.lang.String,java.lang.String> getExtras() {
    return genClient.cacheGet(CacheKey.extras);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<CustomerInfo> {
    customer {
      @Override
      public Object extractValue(CustomerInfo instance) {
        return instance.genClient.extractRecord("customer", com.clover.sdk.v3.customers.Customer.JSON_CREATOR);
      }
    },
    displayString {
      @Override
      public Object extractValue(CustomerInfo instance) {
        return instance.genClient.extractOther("displayString", java.lang.String.class);
      }
    },
    externalId {
      @Override
      public Object extractValue(CustomerInfo instance) {
        return instance.genClient.extractOther("externalId", java.lang.String.class);
      }
    },
    externalSystemName {
      @Override
      public Object extractValue(CustomerInfo instance) {
        return instance.genClient.extractOther("externalSystemName", java.lang.String.class);
      }
    },
    extras {
      @Override
      public Object extractValue(CustomerInfo instance) {
        return instance.genClient.extractMap("extras");
      }
    },
      ;
  }

  private GenericClient<CustomerInfo> genClient;

  /**
   * Constructs a new empty instance.
   */
  public CustomerInfo() {
    genClient = new GenericClient<CustomerInfo>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected CustomerInfo(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public CustomerInfo(String json) throws IllegalArgumentException {
    this();
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public CustomerInfo(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public CustomerInfo(CustomerInfo src) {
    this();
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }

  @Override
  public void validate() {
  }

  /** Checks whether the 'customer' field is set and is not null */
  public boolean isNotNullCustomer() {
    return genClient.cacheValueIsNotNull(CacheKey.customer);
  }

  /** Checks whether the 'displayString' field is set and is not null */
  public boolean isNotNullDisplayString() {
    return genClient.cacheValueIsNotNull(CacheKey.displayString);
  }

  /** Checks whether the 'externalId' field is set and is not null */
  public boolean isNotNullExternalId() {
    return genClient.cacheValueIsNotNull(CacheKey.externalId);
  }

  /** Checks whether the 'externalSystemName' field is set and is not null */
  public boolean isNotNullExternalSystemName() {
    return genClient.cacheValueIsNotNull(CacheKey.externalSystemName);
  }

  /** Checks whether the 'extras' field is set and is not null */
  public boolean isNotNullExtras() {
    return genClient.cacheValueIsNotNull(CacheKey.extras);
  }

  /** Checks whether the 'extras' field is set and is not null and is not empty */
  public boolean isNotEmptyExtras() { return isNotNullExtras() && !getExtras().isEmpty(); }



  /** Checks whether the 'customer' field has been set, however the value could be null */
  public boolean hasCustomer() {
    return genClient.cacheHasKey(CacheKey.customer);
  }

  /** Checks whether the 'displayString' field has been set, however the value could be null */
  public boolean hasDisplayString() {
    return genClient.cacheHasKey(CacheKey.displayString);
  }

  /** Checks whether the 'externalId' field has been set, however the value could be null */
  public boolean hasExternalId() {
    return genClient.cacheHasKey(CacheKey.externalId);
  }

  /** Checks whether the 'externalSystemName' field has been set, however the value could be null */
  public boolean hasExternalSystemName() {
    return genClient.cacheHasKey(CacheKey.externalSystemName);
  }

  /** Checks whether the 'extras' field has been set, however the value could be null */
  public boolean hasExtras() {
    return genClient.cacheHasKey(CacheKey.extras);
  }


  /**
   * Sets the field 'customer'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public CustomerInfo setCustomer(com.clover.sdk.v3.customers.Customer customer) {
    return genClient.setRecord(customer, CacheKey.customer);
  }

  /**
   * Sets the field 'displayString'.
   */
  public CustomerInfo setDisplayString(java.lang.String displayString) {
    return genClient.setOther(displayString, CacheKey.displayString);
  }

  /**
   * Sets the field 'externalId'.
   */
  public CustomerInfo setExternalId(java.lang.String externalId) {
    return genClient.setOther(externalId, CacheKey.externalId);
  }

  /**
   * Sets the field 'externalSystemName'.
   */
  public CustomerInfo setExternalSystemName(java.lang.String externalSystemName) {
    return genClient.setOther(externalSystemName, CacheKey.externalSystemName);
  }

  /**
   * Sets the field 'extras'.
   */
  public CustomerInfo setExtras(java.util.Map<java.lang.String,java.lang.String> extras) {
    return genClient.setOther(extras, CacheKey.extras);
  }


  /** Clears the 'customer' field, the 'has' method for this field will now return false */
  public void clearCustomer() {
    genClient.clear(CacheKey.customer);
  }
  /** Clears the 'displayString' field, the 'has' method for this field will now return false */
  public void clearDisplayString() {
    genClient.clear(CacheKey.displayString);
  }
  /** Clears the 'externalId' field, the 'has' method for this field will now return false */
  public void clearExternalId() {
    genClient.clear(CacheKey.externalId);
  }
  /** Clears the 'externalSystemName' field, the 'has' method for this field will now return false */
  public void clearExternalSystemName() {
    genClient.clear(CacheKey.externalSystemName);
  }
  /** Clears the 'extras' field, the 'has' method for this field will now return false */
  public void clearExtras() {
    genClient.clear(CacheKey.extras);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public CustomerInfo copyChanges() {
    CustomerInfo copy = new CustomerInfo();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(CustomerInfo src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new CustomerInfo(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<CustomerInfo> CREATOR = new android.os.Parcelable.Creator<CustomerInfo>() {
    @Override
    public CustomerInfo createFromParcel(android.os.Parcel in) {
      CustomerInfo instance = new CustomerInfo(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public CustomerInfo[] newArray(int size) {
      return new CustomerInfo[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<CustomerInfo> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<CustomerInfo>() {
    @Override
    public CustomerInfo create(org.json.JSONObject jsonObject) {
      return new CustomerInfo(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean CUSTOMER_IS_REQUIRED = false;
    public static final boolean DISPLAYSTRING_IS_REQUIRED = false;
    public static final boolean EXTERNALID_IS_REQUIRED = false;
    public static final boolean EXTERNALSYSTEMNAME_IS_REQUIRED = false;
    public static final boolean EXTRAS_IS_REQUIRED = false;

  }

}
