/**
 * ItemSearchRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.amazon.ws;

public class ItemSearchRequest  implements java.io.Serializable {
    private java.lang.String actor;

    private java.lang.String artist;

    private com.amazon.ws.AudienceRating[] audienceRating;

    private java.lang.String author;

    private java.lang.String brand;

    private java.lang.String browseNode;

    private java.lang.String city;

    private java.lang.String composer;

    private com.amazon.ws.Condition condition;

    private java.lang.String conductor;

    private org.apache.axis.types.PositiveInteger count;

    private java.lang.String cuisine;

    private com.amazon.ws.DeliveryMethod deliveryMethod;

    private java.lang.String director;

    private java.lang.String futureLaunchDate;

    private java.lang.String ISPUPostalCode;

    private org.apache.axis.types.PositiveInteger itemPage;

    private java.lang.String keywords;

    private java.lang.String manufacturer;

    private org.apache.axis.types.NonNegativeInteger maximumPrice;

    private java.lang.String merchantId;

    private org.apache.axis.types.NonNegativeInteger minimumPrice;

    private java.lang.String musicLabel;

    private java.lang.String neighborhood;

    private java.lang.String orchestra;

    private java.lang.String postalCode;

    private java.lang.String power;

    private java.lang.String publisher;

    private java.lang.String[] responseGroup;

    private java.lang.String searchIndex;

    private java.lang.String sort;

    private java.lang.String state;

    private java.lang.String textStream;

    private java.lang.String title;

    public ItemSearchRequest() {
    }

    public ItemSearchRequest(
           java.lang.String actor,
           java.lang.String artist,
           com.amazon.ws.AudienceRating[] audienceRating,
           java.lang.String author,
           java.lang.String brand,
           java.lang.String browseNode,
           java.lang.String city,
           java.lang.String composer,
           com.amazon.ws.Condition condition,
           java.lang.String conductor,
           org.apache.axis.types.PositiveInteger count,
           java.lang.String cuisine,
           com.amazon.ws.DeliveryMethod deliveryMethod,
           java.lang.String director,
           java.lang.String futureLaunchDate,
           java.lang.String ISPUPostalCode,
           org.apache.axis.types.PositiveInteger itemPage,
           java.lang.String keywords,
           java.lang.String manufacturer,
           org.apache.axis.types.NonNegativeInteger maximumPrice,
           java.lang.String merchantId,
           org.apache.axis.types.NonNegativeInteger minimumPrice,
           java.lang.String musicLabel,
           java.lang.String neighborhood,
           java.lang.String orchestra,
           java.lang.String postalCode,
           java.lang.String power,
           java.lang.String publisher,
           java.lang.String[] responseGroup,
           java.lang.String searchIndex,
           java.lang.String sort,
           java.lang.String state,
           java.lang.String textStream,
           java.lang.String title) {
           this.actor = actor;
           this.artist = artist;
           this.audienceRating = audienceRating;
           this.author = author;
           this.brand = brand;
           this.browseNode = browseNode;
           this.city = city;
           this.composer = composer;
           this.condition = condition;
           this.conductor = conductor;
           this.count = count;
           this.cuisine = cuisine;
           this.deliveryMethod = deliveryMethod;
           this.director = director;
           this.futureLaunchDate = futureLaunchDate;
           this.ISPUPostalCode = ISPUPostalCode;
           this.itemPage = itemPage;
           this.keywords = keywords;
           this.manufacturer = manufacturer;
           this.maximumPrice = maximumPrice;
           this.merchantId = merchantId;
           this.minimumPrice = minimumPrice;
           this.musicLabel = musicLabel;
           this.neighborhood = neighborhood;
           this.orchestra = orchestra;
           this.postalCode = postalCode;
           this.power = power;
           this.publisher = publisher;
           this.responseGroup = responseGroup;
           this.searchIndex = searchIndex;
           this.sort = sort;
           this.state = state;
           this.textStream = textStream;
           this.title = title;
    }


    /**
     * Gets the actor value for this ItemSearchRequest.
     * 
     * @return actor
     */
    public java.lang.String getActor() {
        return actor;
    }


    /**
     * Sets the actor value for this ItemSearchRequest.
     * 
     * @param actor
     */
    public void setActor(java.lang.String actor) {
        this.actor = actor;
    }


    /**
     * Gets the artist value for this ItemSearchRequest.
     * 
     * @return artist
     */
    public java.lang.String getArtist() {
        return artist;
    }


    /**
     * Sets the artist value for this ItemSearchRequest.
     * 
     * @param artist
     */
    public void setArtist(java.lang.String artist) {
        this.artist = artist;
    }


    /**
     * Gets the audienceRating value for this ItemSearchRequest.
     * 
     * @return audienceRating
     */
    public com.amazon.ws.AudienceRating[] getAudienceRating() {
        return audienceRating;
    }


    /**
     * Sets the audienceRating value for this ItemSearchRequest.
     * 
     * @param audienceRating
     */
    public void setAudienceRating(com.amazon.ws.AudienceRating[] audienceRating) {
        this.audienceRating = audienceRating;
    }

    public com.amazon.ws.AudienceRating getAudienceRating(int i) {
        return this.audienceRating[i];
    }

    public void setAudienceRating(int i, com.amazon.ws.AudienceRating _value) {
        this.audienceRating[i] = _value;
    }


    /**
     * Gets the author value for this ItemSearchRequest.
     * 
     * @return author
     */
    public java.lang.String getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this ItemSearchRequest.
     * 
     * @param author
     */
    public void setAuthor(java.lang.String author) {
        this.author = author;
    }


    /**
     * Gets the brand value for this ItemSearchRequest.
     * 
     * @return brand
     */
    public java.lang.String getBrand() {
        return brand;
    }


    /**
     * Sets the brand value for this ItemSearchRequest.
     * 
     * @param brand
     */
    public void setBrand(java.lang.String brand) {
        this.brand = brand;
    }


    /**
     * Gets the browseNode value for this ItemSearchRequest.
     * 
     * @return browseNode
     */
    public java.lang.String getBrowseNode() {
        return browseNode;
    }


    /**
     * Sets the browseNode value for this ItemSearchRequest.
     * 
     * @param browseNode
     */
    public void setBrowseNode(java.lang.String browseNode) {
        this.browseNode = browseNode;
    }


    /**
     * Gets the city value for this ItemSearchRequest.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this ItemSearchRequest.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the composer value for this ItemSearchRequest.
     * 
     * @return composer
     */
    public java.lang.String getComposer() {
        return composer;
    }


    /**
     * Sets the composer value for this ItemSearchRequest.
     * 
     * @param composer
     */
    public void setComposer(java.lang.String composer) {
        this.composer = composer;
    }


    /**
     * Gets the condition value for this ItemSearchRequest.
     * 
     * @return condition
     */
    public com.amazon.ws.Condition getCondition() {
        return condition;
    }


    /**
     * Sets the condition value for this ItemSearchRequest.
     * 
     * @param condition
     */
    public void setCondition(com.amazon.ws.Condition condition) {
        this.condition = condition;
    }


    /**
     * Gets the conductor value for this ItemSearchRequest.
     * 
     * @return conductor
     */
    public java.lang.String getConductor() {
        return conductor;
    }


    /**
     * Sets the conductor value for this ItemSearchRequest.
     * 
     * @param conductor
     */
    public void setConductor(java.lang.String conductor) {
        this.conductor = conductor;
    }


    /**
     * Gets the count value for this ItemSearchRequest.
     * 
     * @return count
     */
    public org.apache.axis.types.PositiveInteger getCount() {
        return count;
    }


    /**
     * Sets the count value for this ItemSearchRequest.
     * 
     * @param count
     */
    public void setCount(org.apache.axis.types.PositiveInteger count) {
        this.count = count;
    }


    /**
     * Gets the cuisine value for this ItemSearchRequest.
     * 
     * @return cuisine
     */
    public java.lang.String getCuisine() {
        return cuisine;
    }


    /**
     * Sets the cuisine value for this ItemSearchRequest.
     * 
     * @param cuisine
     */
    public void setCuisine(java.lang.String cuisine) {
        this.cuisine = cuisine;
    }


    /**
     * Gets the deliveryMethod value for this ItemSearchRequest.
     * 
     * @return deliveryMethod
     */
    public com.amazon.ws.DeliveryMethod getDeliveryMethod() {
        return deliveryMethod;
    }


    /**
     * Sets the deliveryMethod value for this ItemSearchRequest.
     * 
     * @param deliveryMethod
     */
    public void setDeliveryMethod(com.amazon.ws.DeliveryMethod deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }


    /**
     * Gets the director value for this ItemSearchRequest.
     * 
     * @return director
     */
    public java.lang.String getDirector() {
        return director;
    }


    /**
     * Sets the director value for this ItemSearchRequest.
     * 
     * @param director
     */
    public void setDirector(java.lang.String director) {
        this.director = director;
    }


    /**
     * Gets the futureLaunchDate value for this ItemSearchRequest.
     * 
     * @return futureLaunchDate
     */
    public java.lang.String getFutureLaunchDate() {
        return futureLaunchDate;
    }


    /**
     * Sets the futureLaunchDate value for this ItemSearchRequest.
     * 
     * @param futureLaunchDate
     */
    public void setFutureLaunchDate(java.lang.String futureLaunchDate) {
        this.futureLaunchDate = futureLaunchDate;
    }


    /**
     * Gets the ISPUPostalCode value for this ItemSearchRequest.
     * 
     * @return ISPUPostalCode
     */
    public java.lang.String getISPUPostalCode() {
        return ISPUPostalCode;
    }


    /**
     * Sets the ISPUPostalCode value for this ItemSearchRequest.
     * 
     * @param ISPUPostalCode
     */
    public void setISPUPostalCode(java.lang.String ISPUPostalCode) {
        this.ISPUPostalCode = ISPUPostalCode;
    }


    /**
     * Gets the itemPage value for this ItemSearchRequest.
     * 
     * @return itemPage
     */
    public org.apache.axis.types.PositiveInteger getItemPage() {
        return itemPage;
    }


    /**
     * Sets the itemPage value for this ItemSearchRequest.
     * 
     * @param itemPage
     */
    public void setItemPage(org.apache.axis.types.PositiveInteger itemPage) {
        this.itemPage = itemPage;
    }


    /**
     * Gets the keywords value for this ItemSearchRequest.
     * 
     * @return keywords
     */
    public java.lang.String getKeywords() {
        return keywords;
    }


    /**
     * Sets the keywords value for this ItemSearchRequest.
     * 
     * @param keywords
     */
    public void setKeywords(java.lang.String keywords) {
        this.keywords = keywords;
    }


    /**
     * Gets the manufacturer value for this ItemSearchRequest.
     * 
     * @return manufacturer
     */
    public java.lang.String getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets the manufacturer value for this ItemSearchRequest.
     * 
     * @param manufacturer
     */
    public void setManufacturer(java.lang.String manufacturer) {
        this.manufacturer = manufacturer;
    }


    /**
     * Gets the maximumPrice value for this ItemSearchRequest.
     * 
     * @return maximumPrice
     */
    public org.apache.axis.types.NonNegativeInteger getMaximumPrice() {
        return maximumPrice;
    }


    /**
     * Sets the maximumPrice value for this ItemSearchRequest.
     * 
     * @param maximumPrice
     */
    public void setMaximumPrice(org.apache.axis.types.NonNegativeInteger maximumPrice) {
        this.maximumPrice = maximumPrice;
    }


    /**
     * Gets the merchantId value for this ItemSearchRequest.
     * 
     * @return merchantId
     */
    public java.lang.String getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this ItemSearchRequest.
     * 
     * @param merchantId
     */
    public void setMerchantId(java.lang.String merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the minimumPrice value for this ItemSearchRequest.
     * 
     * @return minimumPrice
     */
    public org.apache.axis.types.NonNegativeInteger getMinimumPrice() {
        return minimumPrice;
    }


    /**
     * Sets the minimumPrice value for this ItemSearchRequest.
     * 
     * @param minimumPrice
     */
    public void setMinimumPrice(org.apache.axis.types.NonNegativeInteger minimumPrice) {
        this.minimumPrice = minimumPrice;
    }


    /**
     * Gets the musicLabel value for this ItemSearchRequest.
     * 
     * @return musicLabel
     */
    public java.lang.String getMusicLabel() {
        return musicLabel;
    }


    /**
     * Sets the musicLabel value for this ItemSearchRequest.
     * 
     * @param musicLabel
     */
    public void setMusicLabel(java.lang.String musicLabel) {
        this.musicLabel = musicLabel;
    }


    /**
     * Gets the neighborhood value for this ItemSearchRequest.
     * 
     * @return neighborhood
     */
    public java.lang.String getNeighborhood() {
        return neighborhood;
    }


    /**
     * Sets the neighborhood value for this ItemSearchRequest.
     * 
     * @param neighborhood
     */
    public void setNeighborhood(java.lang.String neighborhood) {
        this.neighborhood = neighborhood;
    }


    /**
     * Gets the orchestra value for this ItemSearchRequest.
     * 
     * @return orchestra
     */
    public java.lang.String getOrchestra() {
        return orchestra;
    }


    /**
     * Sets the orchestra value for this ItemSearchRequest.
     * 
     * @param orchestra
     */
    public void setOrchestra(java.lang.String orchestra) {
        this.orchestra = orchestra;
    }


    /**
     * Gets the postalCode value for this ItemSearchRequest.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this ItemSearchRequest.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the power value for this ItemSearchRequest.
     * 
     * @return power
     */
    public java.lang.String getPower() {
        return power;
    }


    /**
     * Sets the power value for this ItemSearchRequest.
     * 
     * @param power
     */
    public void setPower(java.lang.String power) {
        this.power = power;
    }


    /**
     * Gets the publisher value for this ItemSearchRequest.
     * 
     * @return publisher
     */
    public java.lang.String getPublisher() {
        return publisher;
    }


    /**
     * Sets the publisher value for this ItemSearchRequest.
     * 
     * @param publisher
     */
    public void setPublisher(java.lang.String publisher) {
        this.publisher = publisher;
    }


    /**
     * Gets the responseGroup value for this ItemSearchRequest.
     * 
     * @return responseGroup
     */
    public java.lang.String[] getResponseGroup() {
        return responseGroup;
    }


    /**
     * Sets the responseGroup value for this ItemSearchRequest.
     * 
     * @param responseGroup
     */
    public void setResponseGroup(java.lang.String[] responseGroup) {
        this.responseGroup = responseGroup;
    }

    public java.lang.String getResponseGroup(int i) {
        return this.responseGroup[i];
    }

    public void setResponseGroup(int i, java.lang.String _value) {
        this.responseGroup[i] = _value;
    }


    /**
     * Gets the searchIndex value for this ItemSearchRequest.
     * 
     * @return searchIndex
     */
    public java.lang.String getSearchIndex() {
        return searchIndex;
    }


    /**
     * Sets the searchIndex value for this ItemSearchRequest.
     * 
     * @param searchIndex
     */
    public void setSearchIndex(java.lang.String searchIndex) {
        this.searchIndex = searchIndex;
    }


    /**
     * Gets the sort value for this ItemSearchRequest.
     * 
     * @return sort
     */
    public java.lang.String getSort() {
        return sort;
    }


    /**
     * Sets the sort value for this ItemSearchRequest.
     * 
     * @param sort
     */
    public void setSort(java.lang.String sort) {
        this.sort = sort;
    }


    /**
     * Gets the state value for this ItemSearchRequest.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this ItemSearchRequest.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the textStream value for this ItemSearchRequest.
     * 
     * @return textStream
     */
    public java.lang.String getTextStream() {
        return textStream;
    }


    /**
     * Sets the textStream value for this ItemSearchRequest.
     * 
     * @param textStream
     */
    public void setTextStream(java.lang.String textStream) {
        this.textStream = textStream;
    }


    /**
     * Gets the title value for this ItemSearchRequest.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ItemSearchRequest.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemSearchRequest)) return false;
        ItemSearchRequest other = (ItemSearchRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actor==null && other.getActor()==null) || 
             (this.actor!=null &&
              this.actor.equals(other.getActor()))) &&
            ((this.artist==null && other.getArtist()==null) || 
             (this.artist!=null &&
              this.artist.equals(other.getArtist()))) &&
            ((this.audienceRating==null && other.getAudienceRating()==null) || 
             (this.audienceRating!=null &&
              java.util.Arrays.equals(this.audienceRating, other.getAudienceRating()))) &&
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              this.author.equals(other.getAuthor()))) &&
            ((this.brand==null && other.getBrand()==null) || 
             (this.brand!=null &&
              this.brand.equals(other.getBrand()))) &&
            ((this.browseNode==null && other.getBrowseNode()==null) || 
             (this.browseNode!=null &&
              this.browseNode.equals(other.getBrowseNode()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.composer==null && other.getComposer()==null) || 
             (this.composer!=null &&
              this.composer.equals(other.getComposer()))) &&
            ((this.condition==null && other.getCondition()==null) || 
             (this.condition!=null &&
              this.condition.equals(other.getCondition()))) &&
            ((this.conductor==null && other.getConductor()==null) || 
             (this.conductor!=null &&
              this.conductor.equals(other.getConductor()))) &&
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount()))) &&
            ((this.cuisine==null && other.getCuisine()==null) || 
             (this.cuisine!=null &&
              this.cuisine.equals(other.getCuisine()))) &&
            ((this.deliveryMethod==null && other.getDeliveryMethod()==null) || 
             (this.deliveryMethod!=null &&
              this.deliveryMethod.equals(other.getDeliveryMethod()))) &&
            ((this.director==null && other.getDirector()==null) || 
             (this.director!=null &&
              this.director.equals(other.getDirector()))) &&
            ((this.futureLaunchDate==null && other.getFutureLaunchDate()==null) || 
             (this.futureLaunchDate!=null &&
              this.futureLaunchDate.equals(other.getFutureLaunchDate()))) &&
            ((this.ISPUPostalCode==null && other.getISPUPostalCode()==null) || 
             (this.ISPUPostalCode!=null &&
              this.ISPUPostalCode.equals(other.getISPUPostalCode()))) &&
            ((this.itemPage==null && other.getItemPage()==null) || 
             (this.itemPage!=null &&
              this.itemPage.equals(other.getItemPage()))) &&
            ((this.keywords==null && other.getKeywords()==null) || 
             (this.keywords!=null &&
              this.keywords.equals(other.getKeywords()))) &&
            ((this.manufacturer==null && other.getManufacturer()==null) || 
             (this.manufacturer!=null &&
              this.manufacturer.equals(other.getManufacturer()))) &&
            ((this.maximumPrice==null && other.getMaximumPrice()==null) || 
             (this.maximumPrice!=null &&
              this.maximumPrice.equals(other.getMaximumPrice()))) &&
            ((this.merchantId==null && other.getMerchantId()==null) || 
             (this.merchantId!=null &&
              this.merchantId.equals(other.getMerchantId()))) &&
            ((this.minimumPrice==null && other.getMinimumPrice()==null) || 
             (this.minimumPrice!=null &&
              this.minimumPrice.equals(other.getMinimumPrice()))) &&
            ((this.musicLabel==null && other.getMusicLabel()==null) || 
             (this.musicLabel!=null &&
              this.musicLabel.equals(other.getMusicLabel()))) &&
            ((this.neighborhood==null && other.getNeighborhood()==null) || 
             (this.neighborhood!=null &&
              this.neighborhood.equals(other.getNeighborhood()))) &&
            ((this.orchestra==null && other.getOrchestra()==null) || 
             (this.orchestra!=null &&
              this.orchestra.equals(other.getOrchestra()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.power==null && other.getPower()==null) || 
             (this.power!=null &&
              this.power.equals(other.getPower()))) &&
            ((this.publisher==null && other.getPublisher()==null) || 
             (this.publisher!=null &&
              this.publisher.equals(other.getPublisher()))) &&
            ((this.responseGroup==null && other.getResponseGroup()==null) || 
             (this.responseGroup!=null &&
              java.util.Arrays.equals(this.responseGroup, other.getResponseGroup()))) &&
            ((this.searchIndex==null && other.getSearchIndex()==null) || 
             (this.searchIndex!=null &&
              this.searchIndex.equals(other.getSearchIndex()))) &&
            ((this.sort==null && other.getSort()==null) || 
             (this.sort!=null &&
              this.sort.equals(other.getSort()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.textStream==null && other.getTextStream()==null) || 
             (this.textStream!=null &&
              this.textStream.equals(other.getTextStream()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getActor() != null) {
            _hashCode += getActor().hashCode();
        }
        if (getArtist() != null) {
            _hashCode += getArtist().hashCode();
        }
        if (getAudienceRating() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAudienceRating());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAudienceRating(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthor() != null) {
            _hashCode += getAuthor().hashCode();
        }
        if (getBrand() != null) {
            _hashCode += getBrand().hashCode();
        }
        if (getBrowseNode() != null) {
            _hashCode += getBrowseNode().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getComposer() != null) {
            _hashCode += getComposer().hashCode();
        }
        if (getCondition() != null) {
            _hashCode += getCondition().hashCode();
        }
        if (getConductor() != null) {
            _hashCode += getConductor().hashCode();
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        if (getCuisine() != null) {
            _hashCode += getCuisine().hashCode();
        }
        if (getDeliveryMethod() != null) {
            _hashCode += getDeliveryMethod().hashCode();
        }
        if (getDirector() != null) {
            _hashCode += getDirector().hashCode();
        }
        if (getFutureLaunchDate() != null) {
            _hashCode += getFutureLaunchDate().hashCode();
        }
        if (getISPUPostalCode() != null) {
            _hashCode += getISPUPostalCode().hashCode();
        }
        if (getItemPage() != null) {
            _hashCode += getItemPage().hashCode();
        }
        if (getKeywords() != null) {
            _hashCode += getKeywords().hashCode();
        }
        if (getManufacturer() != null) {
            _hashCode += getManufacturer().hashCode();
        }
        if (getMaximumPrice() != null) {
            _hashCode += getMaximumPrice().hashCode();
        }
        if (getMerchantId() != null) {
            _hashCode += getMerchantId().hashCode();
        }
        if (getMinimumPrice() != null) {
            _hashCode += getMinimumPrice().hashCode();
        }
        if (getMusicLabel() != null) {
            _hashCode += getMusicLabel().hashCode();
        }
        if (getNeighborhood() != null) {
            _hashCode += getNeighborhood().hashCode();
        }
        if (getOrchestra() != null) {
            _hashCode += getOrchestra().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getPower() != null) {
            _hashCode += getPower().hashCode();
        }
        if (getPublisher() != null) {
            _hashCode += getPublisher().hashCode();
        }
        if (getResponseGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponseGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponseGroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSearchIndex() != null) {
            _hashCode += getSearchIndex().hashCode();
        }
        if (getSort() != null) {
            _hashCode += getSort().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getTextStream() != null) {
            _hashCode += getTextStream().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemSearchRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "ItemSearchRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Actor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("artist");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Artist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audienceRating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "AudienceRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "AudienceRating"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Author"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Brand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browseNode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "BrowseNode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("composer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Composer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Condition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">Condition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conductor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Conductor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuisine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Cuisine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "DeliveryMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">DeliveryMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("director");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Director"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("futureLaunchDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "FutureLaunchDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISPUPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "ISPUPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "ItemPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Keywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Manufacturer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "MaximumPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "MerchantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "MinimumPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("musicLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "MusicLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("neighborhood");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Neighborhood"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orchestra");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Orchestra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("power");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Power"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisher");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Publisher"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "ResponseGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "SearchIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sort");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Sort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textStream");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "TextStream"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
