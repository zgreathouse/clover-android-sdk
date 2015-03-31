/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2015 Clover Network, Inc.
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

package com.clover.sdk.v3.apps;

@SuppressWarnings("all")
public final class AppUsbDevice implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.String getPackageName() {
    return cacheGet(CacheKey.packageName);
  }
  public java.lang.Integer getVendorId() {
    return cacheGet(CacheKey.vendorId);
  }
  public java.lang.Integer getProductId() {
    return cacheGet(CacheKey.productId);
  }
  public com.clover.sdk.v3.base.Reference getApp() {
    return cacheGet(CacheKey.app);
  }


  private enum CacheKey {
    packageName {
      @Override
      public Object extractValue(AppUsbDevice instance) {
        return instance.extractPackageName();
      }
    },
    vendorId {
      @Override
      public Object extractValue(AppUsbDevice instance) {
        return instance.extractVendorId();
      }
    },
    productId {
      @Override
      public Object extractValue(AppUsbDevice instance) {
        return instance.extractProductId();
      }
    },
    app {
      @Override
      public Object extractValue(AppUsbDevice instance) {
        return instance.extractApp();
      }
    },
    ;

    public abstract Object extractValue(AppUsbDevice instance);
  }

  private org.json.JSONObject jsonObject = null;
  private android.os.Bundle bundle = null;
  private android.os.Bundle changeLog = null;
  private Object[] cache = null;
  private byte[] cacheState = null;

  private static final byte STATE_NOT_CACHED = 0;
  private static final byte STATE_CACHED_NO_VALUE = 1;
  private static final byte STATE_CACHED_VALUE = 2;

  /**
   * Constructs a new empty instance.
   */
  public AppUsbDevice() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public AppUsbDevice(String json) throws java.lang.IllegalArgumentException {
    try {
      this.jsonObject = new org.json.JSONObject(json);
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public AppUsbDevice(org.json.JSONObject jsonObject) {
    this.jsonObject = jsonObject;
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public AppUsbDevice(AppUsbDevice src) {
    if (src.jsonObject != null) {
      this.jsonObject = com.clover.sdk.v3.JsonHelper.deepCopy(src.getJSONObject());
    }
  }

  private <T> T cacheGet(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return (T) cache[index];
  }

  private boolean cacheValueIsNotNull(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return cache[index] != null;
  }

  private boolean cacheHasKey(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return cacheState[index] == STATE_CACHED_VALUE;
  }

  private void cacheRemoveValue(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    cache[index] = null;
    cacheState[index] = STATE_CACHED_NO_VALUE;
  }

  private void cacheMarkDirty(CacheKey key) {
    if (cache != null) {
      int index = key.ordinal();
      cache[index] = null;
      cacheState[index] = STATE_NOT_CACHED;
    }
  }

  private void populateCache(int index) {
    if (cache == null) {
      int size = CacheKey.values().length;
      cache = new Object[size];
      cacheState = new byte[size];
    }

    if (cacheState[index] == STATE_NOT_CACHED) {
      CacheKey key = CacheKey.values()[index];

      if (getJSONObject().has(key.name())) {
        cache[index] = key.extractValue(this);
        cacheState[index] = STATE_CACHED_VALUE;
      } else {
        cacheState[index] = STATE_CACHED_NO_VALUE;
      }
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    if (jsonObject == null) {
      jsonObject = new org.json.JSONObject();
    }
    return jsonObject;
  }


  @Override
  public void validate() {
    java.lang.String packageName = getPackageName();
    if (packageName != null && packageName.length() > 255) { throw new IllegalArgumentException("Maximum string length exceeded for 'packageName'");}

    java.lang.Integer vendorId = getVendorId();
    if (vendorId != null && ( vendorId < 0)) throw new IllegalArgumentException("Invalid value for 'vendorId'");

    java.lang.Integer productId = getProductId();
    if (productId != null && ( productId < 0)) throw new IllegalArgumentException("Invalid value for 'productId'");
  }



  private java.lang.String extractPackageName() {
    return getJSONObject().isNull("packageName") ? null :
      getJSONObject().optString("packageName");
  }


  private java.lang.Integer extractVendorId() {
    return getJSONObject().isNull("vendorId") ? null :
      getJSONObject().optInt("vendorId");
  }


  private java.lang.Integer extractProductId() {
    return getJSONObject().isNull("productId") ? null :
      getJSONObject().optInt("productId");
  }


  private com.clover.sdk.v3.base.Reference extractApp() {
    org.json.JSONObject jsonObj = getJSONObject().optJSONObject("app");
    if (jsonObj != null) {
      return new com.clover.sdk.v3.base.Reference(getJSONObject().optJSONObject("app"));
    }
    return null;
  }


  /** Checks whether the 'packageName' field is set and is not null */
  public boolean isNotNullPackageName() {
    return cacheValueIsNotNull(CacheKey.packageName);
  }

  /** Checks whether the 'vendorId' field is set and is not null */
  public boolean isNotNullVendorId() {
    return cacheValueIsNotNull(CacheKey.vendorId);
  }

  /** Checks whether the 'productId' field is set and is not null */
  public boolean isNotNullProductId() {
    return cacheValueIsNotNull(CacheKey.productId);
  }

  /** Checks whether the 'app' field is set and is not null */
  public boolean isNotNullApp() {
    return cacheValueIsNotNull(CacheKey.app);
  }


  /** Checks whether the 'packageName' field has been set, however the value could be null */
  public boolean hasPackageName() {
    return cacheHasKey(CacheKey.packageName);
  }

  /** Checks whether the 'vendorId' field has been set, however the value could be null */
  public boolean hasVendorId() {
    return cacheHasKey(CacheKey.vendorId);
  }

  /** Checks whether the 'productId' field has been set, however the value could be null */
  public boolean hasProductId() {
    return cacheHasKey(CacheKey.productId);
  }

  /** Checks whether the 'app' field has been set, however the value could be null */
  public boolean hasApp() {
    return cacheHasKey(CacheKey.app);
  }


  /**
   * Sets the field 'packageName'.
   */
  public AppUsbDevice setPackageName(java.lang.String packageName) {
    logChange("packageName");

    try {
      getJSONObject().put("packageName", packageName == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(packageName));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.packageName);
    return this;
  }

  /**
   * Sets the field 'vendorId'.
   */
  public AppUsbDevice setVendorId(java.lang.Integer vendorId) {
    logChange("vendorId");

    try {
      getJSONObject().put("vendorId", vendorId == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(vendorId));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.vendorId);
    return this;
  }

  /**
   * Sets the field 'productId'.
   */
  public AppUsbDevice setProductId(java.lang.Integer productId) {
    logChange("productId");

    try {
      getJSONObject().put("productId", productId == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(productId));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.productId);
    return this;
  }

  /**
   * Sets the field 'app'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public AppUsbDevice setApp(com.clover.sdk.v3.base.Reference app) {
    logChange("app");

    try {
      getJSONObject().put("app",
          app == null ? org.json.JSONObject.NULL : app.getJSONObject());
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.app);
    return this;
  }


  /** Clears the 'packageName' field, the 'has' method for this field will now return false */
  public void clearPackageName() {
    unlogChange("packageName");
    getJSONObject().remove("packageName");
    cacheRemoveValue(CacheKey.packageName);
  }

  /** Clears the 'vendorId' field, the 'has' method for this field will now return false */
  public void clearVendorId() {
    unlogChange("vendorId");
    getJSONObject().remove("vendorId");
    cacheRemoveValue(CacheKey.vendorId);
  }

  /** Clears the 'productId' field, the 'has' method for this field will now return false */
  public void clearProductId() {
    unlogChange("productId");
    getJSONObject().remove("productId");
    cacheRemoveValue(CacheKey.productId);
  }

  /** Clears the 'app' field, the 'has' method for this field will now return false */
  public void clearApp() {
    unlogChange("app");
    getJSONObject().remove("app");
    cacheRemoveValue(CacheKey.app);
  }


  private void logChange(java.lang.String field) {
    if (changeLog == null) {
      changeLog = new android.os.Bundle();
    }
    changeLog.putString(field, null);
  }

  private void unlogChange(java.lang.String field) {
    if (changeLog != null) {
      changeLog.remove(field);
    }
  }

  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return changeLog != null;
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    changeLog = null;
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public AppUsbDevice copyChanges() {
    AppUsbDevice copy = new AppUsbDevice();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(AppUsbDevice src) {
    if (src.changeLog != null) {
      try {
        // Make a copy of the source so the destination fields are copies
        org.json.JSONObject srcObj = new AppUsbDevice(src).getJSONObject();
        org.json.JSONObject dstObj = getJSONObject();
        for (java.lang.String field : src.changeLog.keySet()) {
          dstObj.put(field, srcObj.get(field));
          logChange(field);
        }
      } catch (org.json.JSONException e) {
        throw new java.lang.IllegalArgumentException(e);
      }
    }
  }


  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    if (bundle == null) {
      bundle = new android.os.Bundle();
    }
    return bundle;
  }

  @Override
  public String toString() {
    String json = getJSONObject().toString();

    if (bundle != null) {
      bundle.isEmpty(); // Triggers unparcel
    }

    if (changeLog != null) {
      changeLog.isEmpty(); // Triggers unparcel
    }

    return "AppUsbDevice{" +
        "json='" + json + "'" +
        ", bundle=" + bundle +
        ", changeLog=" + changeLog +
        '}';
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
	  com.clover.sdk.v3.JsonParcelHelper.wrap(getJSONObject()).writeToParcel(dest, 0);
    dest.writeBundle(bundle);
    dest.writeBundle(changeLog);
  }

  public static final android.os.Parcelable.Creator<AppUsbDevice> CREATOR = new android.os.Parcelable.Creator<AppUsbDevice>() {
    @Override
    public AppUsbDevice createFromParcel(android.os.Parcel in) {
      AppUsbDevice instance = new AppUsbDevice(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.bundle = in.readBundle(getClass().getClassLoader());
      instance.changeLog = in.readBundle();
      return instance;
    }

    @Override
    public AppUsbDevice[] newArray(int size) {
      return new AppUsbDevice[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<AppUsbDevice> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<AppUsbDevice>() {
    @Override
    public AppUsbDevice create(org.json.JSONObject jsonObject) {
      return new AppUsbDevice(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean PACKAGENAME_IS_REQUIRED = false;
    public static final long PACKAGENAME_MAX_LEN = 255;

    public static final boolean VENDORID_IS_REQUIRED = false;
    public static final long VENDORID_MIN = 0;

    public static final boolean PRODUCTID_IS_REQUIRED = false;
    public static final long PRODUCTID_MIN = 0;

    public static final boolean APP_IS_REQUIRED = false;

  }

}