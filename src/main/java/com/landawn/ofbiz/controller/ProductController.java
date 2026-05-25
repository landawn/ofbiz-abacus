package com.landawn.ofbiz.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/product")
public class ProductController {

    /**
     * Create a ProductFeatureIactn
     * <p>service: createProductFeatureIactn  entities: ProductFeatureIactn  auth: true
     */
    @PostMapping("/catalog/control/AddProductFeatureIactn")
    public ResponseEntity<Map<String, Object>> createProductFeatureIactn(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductStoreGroupMember
     * <p>service: createProductStoreGroupMember  entities: ProductStoreGroupMember  auth: true
     */
    @PostMapping("/catalog/control/AddProductStoreToGroup")
    public ResponseEntity<Map<String, Object>> createProductStoreGroupMember(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Apply a ProductFeature to a Product; a fromDate can be used to specify when the feature will be applied, if no fromDate is specified, it will be applied now.
     * <p>service: applyFeatureToProduct  entities: ProductFeatureAppl  auth: true
     */
    @PostMapping("/catalog/control/ApplyFeatureToProduct")
    public ResponseEntity<Map<String, Object>> applyFeatureToProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Apply a ProductFeature to a Product
     * <p>service: applyFeatureToProductFromTypeAndCode  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/ApplyFeatureToProductFromTypeAndCode")
    public ResponseEntity<Map<String, Object>> applyFeatureToProductFromTypeAndCode(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createProductFeatureGroupAppl  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/ApplyFeaturesFromCategoryToGroup")
    public ResponseEntity<Map<String, Object>> createProductFeatureGroupAppl(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: applyFeatureToProduct  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/ApplyFeaturesToProduct")
    public ResponseEntity<Map<String, Object>> applyFeatureToProductApplyFeaturesToProduct(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createProductFeature  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/BulkAddProductFeatures")
    public ResponseEntity<Map<String, Object>> createProductFeature(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductFeatureCategory record
     * <p>service: createProductFeatureCategory  entities: ProductFeatureCategory  auth: true
     */
    @PostMapping("/catalog/control/CreateFeatureCategory")
    public ResponseEntity<Map<String, Object>> createProductFeatureCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductFeatureGroup
     * <p>service: createProductFeatureGroup  entities: ProductFeatureGroup  auth: true
     */
    @PostMapping("/catalog/control/CreateProductFeatureGroup")
    public ResponseEntity<Map<String, Object>> createProductFeatureGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductFeatureGroup to ProductFeature Application
     * <p>service: createProductFeatureGroupAppl  entities: ProductFeatureGroupAppl  auth: true
     */
    @PostMapping("/catalog/control/CreateProductFeatureGroupAppl")
    public ResponseEntity<Map<String, Object>> createProductFeatureGroupApplCreateProductFeatureGroupAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ProductStoreFinActSetting
     * <p>service: createProductStoreFinActSetting  entities: ProductStoreFinActSetting  auth: true
     */
    @PostMapping("/catalog/control/CreateProductStoreFinAccountSettings")
    public ResponseEntity<Map<String, Object>> createProductStoreFinActSetting(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create missing Category and Product Alternative URLs
     * <p>service: createMissingCategoryAndProductAltUrls  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/CreateSeoProdCatalog")
    public ResponseEntity<Map<String, Object>> createMissingCategoryAndProductAltUrls(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Crop Image
     * <p>service: imageCrop  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/CropImage")
    public ResponseEntity<Map<String, Object>> imageCrop(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Duplicate a Product using a new productId
     * <p>service: duplicateProduct  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/DuplicateProduct")
    public ResponseEntity<Map<String, Object>> duplicateProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Duplicate a Product Category using from oldProductCategoryId to a new productCategoryId
     * <p>service: duplicateProductCategory  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/DuplicateProductCategory")
    public ResponseEntity<Map<String, Object>> duplicateProductCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: quickAddChosenVariant  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/QuickAddChosenVariant")
    public ResponseEntity<Map<String, Object>> quickAddChosenVariant(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: quickAddVariant  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/QuickAddChosenVariants")
    public ResponseEntity<Map<String, Object>> quickAddVariant(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a ProductFeature from a Product
     * <p>service: removeFeatureFromProduct  entities: ProductFeatureAppl  auth: true
     */
    @PostMapping("/catalog/control/RemoveFeatureFromProduct")
    public ResponseEntity<Map<String, Object>> removeFeatureFromProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a ProductFeatureGroup to ProductFeature Application
     * <p>service: removeProductFeatureGroupAppl  entities: ProductFeatureGroupAppl  auth: true
     */
    @PostMapping("/catalog/control/RemoveProductFeatureGroupAppl")
    public ResponseEntity<Map<String, Object>> removeProductFeatureGroupAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ProductStoreFinActSetting
     * <p>service: removeProductStoreFinActSetting  entities: ProductStoreFinActSetting  auth: true
     */
    @PostMapping("/catalog/control/RemoveProductStoreFinAccountSettings")
    public ResponseEntity<Map<String, Object>> removeProductStoreFinActSetting(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Rotate Image
     * <p>service: imageRotate  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/RotateImage")
    public ResponseEntity<Map<String, Object>> imageRotate(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateAllKeywords  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/UpdateAllKeywords")
    public ResponseEntity<Map<String, Object>> updateAllKeywords(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductFeatureCategory record
     * <p>service: updateProductFeatureCategory  entities: ProductFeatureCategory  auth: true
     */
    @PostMapping("/catalog/control/UpdateFeatureCategory")
    public ResponseEntity<Map<String, Object>> updateProductFeatureCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateFeatureToProductApplication  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/UpdateFeatureToProductApplication")
    public ResponseEntity<Map<String, Object>> updateFeatureToProductApplication(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductFeatureGroup
     * <p>service: updateProductFeatureGroup  entities: ProductFeatureGroup  auth: true
     */
    @PostMapping("/catalog/control/UpdateProductFeatureGroup")
    public ResponseEntity<Map<String, Object>> updateProductFeatureGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateProductFeatureGroupAppl  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/UpdateProductFeatureGroupAppl")
    public ResponseEntity<Map<String, Object>> updateProductFeatureGroupAppl(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateProductFeature  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/UpdateProductFeatureInCategory")
    public ResponseEntity<Map<String, Object>> updateProductFeature(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ProductStoreFinActSetting
     * <p>service: updateProductStoreFinActSetting  entities: ProductStoreFinActSetting  auth: true
     */
    @PostMapping("/catalog/control/UpdateProductStoreFinAccountSettings")
    public ResponseEntity<Map<String, Object>> updateProductStoreFinActSetting(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Copy Virtual Product's data to the Variant Products
     * <p>service: copyToProductVariants  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/UpdateProductVariants")
    public ResponseEntity<Map<String, Object>> copyToProductVariants(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create (when not exist) or update (when exist) a Subscription attribute
     * <p>service: updateSubscriptionAttribute  entities: SubscriptionAttribute  auth: true
     */
    @PostMapping("/catalog/control/UpdateSubscriptionAttribute")
    public ResponseEntity<Map<String, Object>> updateSubscriptionAttribute(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addAdditionalViewForProduct  entities: ProductContent  auth: true
     */
    @PostMapping("/catalog/control/addAdditionalImageContentForProduct")
    public ResponseEntity<Map<String, Object>> addAdditionalViewForProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Upload Additional View Images For Product
     * <p>service: uploadProductAdditionalViewImages  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/addAdditionalImagesForProduct")
    public ResponseEntity<Map<String, Object>> uploadProductAdditionalViewImages(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Product To Category
     * <p>service: safeAddProductToCategory  entities: ProductCategoryMember  auth: true
     */
    @PostMapping("/catalog/control/addCategoryProductMember")
    public ResponseEntity<Map<String, Object>> safeAddProductToCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Content To Category
     * <p>service: createCategoryContent  entities: Content, ProductCategoryContent  auth: true
     */
    @PostMapping("/catalog/control/addContentToCategory")
    public ResponseEntity<Map<String, Object>> createCategoryContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Content To Product
     * <p>service: createProductContent  entities: Content, ProductContent  auth: true
     */
    @PostMapping("/catalog/control/addContentToProduct")
    public ResponseEntity<Map<String, Object>> createProductContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Content To ProductConfigItem
     * <p>service: createProductConfigItemContent  entities: Content, ProdConfItemContent  auth: true
     */
    @PostMapping("/catalog/control/addContentToProductConfigItem")
    public ResponseEntity<Map<String, Object>> createProductConfigItemContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Product To Fixed Asset
     * <p>service: addFixedAssetProduct  entities: FixedAssetProduct  auth: true
     */
    @PostMapping("/catalog/control/addFixedAssetProduct")
    public ResponseEntity<Map<String, Object>> addFixedAssetProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addImageForProductPromo  entities: ProductPromoContent  auth: true
     */
    @PostMapping("/catalog/control/addImageContentForProductPromo")
    public ResponseEntity<Map<String, Object>> addImageForProductPromo(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Multiple upload Images For Product
     * <p>service: multipleUploadProductImages  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/addImageForProduct")
    public ResponseEntity<Map<String, Object>> multipleUploadProductImages(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Party To Category
     * <p>service: addPartyToCategory  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/addPartyToCategory")
    public ResponseEntity<Map<String, Object>> addPartyToCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Party To Product
     * <p>service: addPartyToProduct  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/addPartyToProduct")
    public ResponseEntity<Map<String, Object>> addPartyToProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add ProdCatalog To Party
     * <p>service: addProdCatalogToParty  entities: ProdCatalogRole  auth: true
     */
    @PostMapping("/catalog/control/addProdCatalogToParty")
    public ResponseEntity<Map<String, Object>> addProdCatalogToParty(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Safe Add ProductCategory To Category (requires fromDate)
     * <p>service: safeAddProductCategoryToCategory  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/addProductCategoryToCategory")
    public ResponseEntity<Map<String, Object>> safeAddProductCategoryToCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add ProductCategory To ProdCatalog
     * <p>service: addProductCategoryToProdCatalog  entities: ProdCatalogCategory  auth: true
     */
    @PostMapping("/catalog/control/addProductCategoryToProdCatalog")
    public ResponseEntity<Map<String, Object>> addProductCategoryToProdCatalog(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductStoreFacility
     * <p>service: createProductStoreFacility  entities: ProductStoreFacility  auth: true
     */
    @PostMapping("/catalog/control/addProductStoreFacility")
    public ResponseEntity<Map<String, Object>> createProductStoreFacility(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Product To Category
     * <p>service: safeAddProductToCategory  entities: ProductCategoryMember  auth: true
     */
    @PostMapping("/catalog/control/addProductToCategory")
    public ResponseEntity<Map<String, Object>> safeAddProductToCategoryAddProductToCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addRejectedReasonImageManagement  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/addRejectedReasonImageManagement")
    public ResponseEntity<Map<String, Object>> addRejectedReasonImageManagement(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * This will create a virtual product and return its ID, and associate all of the variants with it. It will not put the selectable features on the virtual or standard features on the variant.
     * <p>service: quickCreateVirtualWithVariants  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/addVariantsToVirtual")
    public ResponseEntity<Map<String, Object>> quickCreateVirtualWithVariants(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Attach Product Features To Category Through Groups
     * <p>service: attachProductFeaturesToCategory  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/attachProductFeaturesToCategory")
    public ResponseEntity<Map<String, Object>> attachProductFeaturesToCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Calculates the product's costs. If the product does not have cost component defined, will use the BOM to calculate the cost.
     * <p>service: calculateProductCosts  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/calculateProductCosts")
    public ResponseEntity<Map<String, Object>> calculateProductCosts(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add ProductCategory To ProdCatalog
     * <p>service: addProductCategoryToProdCatalog  entities: ProdCatalogCategory  auth: true
     */
    @PostMapping("/catalog/control/category_addProductCategoryToProdCatalog")
    public ResponseEntity<Map<String, Object>> addProductCategoryToProdCatalogCategoryAddProductCategoryToProdCatalog(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ProductCategory From ProdCatalog
     * <p>service: removeProductCategoryFromProdCatalog  entities: ProdCatalogCategory  auth: true
     */
    @PostMapping("/catalog/control/category_removeProductCategoryFromProdCatalog")
    public ResponseEntity<Map<String, Object>> removeProductCategoryFromProdCatalog(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add ProductCategory To ProdCatalog
     * <p>service: updateProductCategoryToProdCatalog  entities: ProdCatalogCategory  auth: true
     */
    @PostMapping("/catalog/control/category_updateProductCategoryToProdCatalog")
    public ResponseEntity<Map<String, Object>> updateProductCategoryToProdCatalog(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: test  entities: unknown  auth: false
     */
    @GetMapping("/catalog/control/chain")
    public ResponseEntity<Map<String, Object>> test(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: -  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/checkAction")
    public ResponseEntity<Map<String, Object>> checkAction(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: -  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/checkRejected")
    public ResponseEntity<Map<String, Object>> checkRejected(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: chooseFrameImage  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/chooseFrameImage")
    public ResponseEntity<Map<String, Object>> chooseFrameImage(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Copy Product Members from one Category to Another, optionally filtering by the given valid date (otherwise no date filtering done), and optionally recursing (if recurse=Y) down the from category
     * <p>service: copyCategoryProductMembers  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/copyCategoryProductMembers")
    public ResponseEntity<Map<String, Object>> copyCategoryProductMembers(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates several ProductPromoCode from an uploaded list of promo codes (one code per line)
     * <p>service: createBulkProductPromoCode  entities: ProductPromoCode  auth: true
     */
    @PostMapping("/catalog/control/createBulkProductPromoCode")
    public ResponseEntity<Map<String, Object>> createBulkProductPromoCode(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create several ProductPromoCodeEmail from an uploaded list of emails (one address per line)
     * <p>service: createBulkProductPromoCodeEmail  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/createBulkProductPromoCodeEmail")
    public ResponseEntity<Map<String, Object>> createBulkProductPromoCodeEmail(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates A CarrierShipmentMethod
     * <p>service: createCarrierShipmentMethod  entities: CarrierShipmentMethod  auth: true
     */
    @PostMapping("/catalog/control/createCarrierShipmentMethod")
    public ResponseEntity<Map<String, Object>> createCarrierShipmentMethod(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Communication Event with permission check
     * <p>service: createCommunicationEvent  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/createCommunicationEvent")
    public ResponseEntity<Map<String, Object>> createCommunicationEvent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a CostComponent
     * <p>service: createCostComponent  entities: CostComponent  auth: true
     */
    @PostMapping("/catalog/control/createCostComponent")
    public ResponseEntity<Map<String, Object>> createCostComponent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createDownloadContentForCategory  entities: Content, ProductCategoryContent  auth: true
     */
    @PostMapping("/catalog/control/createDownloadContentForCategory")
    public ResponseEntity<Map<String, Object>> createDownloadContentForCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createDownloadContentForProduct  entities: Content, ProductContent  auth: true
     */
    @PostMapping("/catalog/control/createDownloadContentForProduct")
    public ResponseEntity<Map<String, Object>> createDownloadContentForProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createEmailContentForProduct  entities: Content, ProductContent  auth: true
     */
    @PostMapping("/catalog/control/createEmailContentForProduct")
    public ResponseEntity<Map<String, Object>> createEmailContentForProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Content To Product
     * <p>service: createProductContent  entities: Content, ProductContent  auth: true
     */
    @PostMapping("/catalog/control/createExternalContentForProduct")
    public ResponseEntity<Map<String, Object>> createProductContentCreateExternalContentForProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Feature Price
     * <p>service: createFeaturePrice  entities: ProductFeaturePrice  auth: true
     */
    @PostMapping("/catalog/control/createFeaturePrice")
    public ResponseEntity<Map<String, Object>> createFeaturePrice(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a GoodIdentification
     * <p>service: createGoodIdentification  entities: GoodIdentification  auth: true
     */
    @PostMapping("/catalog/control/createGoodIdentification")
    public ResponseEntity<Map<String, Object>> createGoodIdentification(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Image Frame For Product.
     * <p>service: addImageFrame  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/createImageFrame")
    public ResponseEntity<Map<String, Object>> addImageFrame(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Keyword Thesaurus
     * <p>service: createKeywordThesaurus  entities: KeywordThesaurus  auth: true
     */
    @PostMapping("/catalog/control/createKeywordThesaurus")
    public ResponseEntity<Map<String, Object>> createKeywordThesaurus(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProdCatalog
     * <p>service: createProdCatalog  entities: ProdCatalog  auth: true
     */
    @PostMapping("/catalog/control/createProdCatalog")
    public ResponseEntity<Map<String, Object>> createProdCatalog(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ProductStoreCatalog
     * <p>service: createProductStoreCatalog  entities: ProductStoreCatalog  auth: true
     */
    @PostMapping("/catalog/control/createProdCatalogStore")
    public ResponseEntity<Map<String, Object>> createProductStoreCatalog(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Product
     * <p>service: createProduct  entities: Product  auth: true
     */
    @PostMapping("/catalog/control/createProduct")
    public ResponseEntity<Map<String, Object>> createProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createProductAssoc  entities: ProductAssoc  auth: true
     */
    @PostMapping("/catalog/control/createProductAssoc")
    public ResponseEntity<Map<String, Object>> createProductAssoc(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductAttribute
     * <p>service: createProductAttribute  entities: ProductAttribute  auth: true
     */
    @PostMapping("/catalog/control/createProductAttribute")
    public ResponseEntity<Map<String, Object>> createProductAttribute(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an ProductCategory
     * <p>service: createProductCategory  entities: ProductCategory  auth: true
     */
    @PostMapping("/catalog/control/createProductCategory")
    public ResponseEntity<Map<String, Object>> createProductCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createProductCategoryAttribute  entities: ProductCategoryAttribute  auth: true
     */
    @PostMapping("/catalog/control/createProductCategoryAttribute")
    public ResponseEntity<Map<String, Object>> createProductCategoryAttribute(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductCategoryLink
     * <p>service: createProductCategoryLink  entities: ProductCategoryLink  auth: true
     */
    @PostMapping("/catalog/control/createProductCategoryLink")
    public ResponseEntity<Map<String, Object>> createProductCategoryLink(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductConfig
     * <p>service: createProductConfig  entities: ProductConfig  auth: true
     */
    @PostMapping("/catalog/control/createProductConfig")
    public ResponseEntity<Map<String, Object>> createProductConfig(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductConfigItem
     * <p>service: createProductConfigItem  entities: ProductConfigItem  auth: true
     */
    @PostMapping("/catalog/control/createProductConfigItem")
    public ResponseEntity<Map<String, Object>> createProductConfigItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Config Option
     * <p>service: createProductConfigOption  entities: ProductConfigOption  auth: true
     */
    @PostMapping("/catalog/control/createProductConfigOption")
    public ResponseEntity<Map<String, Object>> createProductConfigOption(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductConfigProduct
     * <p>service: createProductConfigProduct  entities: ProductConfigProduct  auth: true
     */
    @PostMapping("/catalog/control/createProductConfigProduct")
    public ResponseEntity<Map<String, Object>> createProductConfigProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductCostComponentCalc
     * <p>service: createProductCostComponentCalc  entities: ProductCostComponentCalc  auth: true
     */
    @PostMapping("/catalog/control/createProductCostComponentCalc")
    public ResponseEntity<Map<String, Object>> createProductCostComponentCalc(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an ProductFacility
     * <p>service: createProductFacility  entities: ProductFacility  auth: true
     */
    @PostMapping("/catalog/control/createProductFacility")
    public ResponseEntity<Map<String, Object>> createProductFacility(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an ProductFacilityLocation
     * <p>service: createProductFacilityLocation  entities: ProductFacilityLocation  auth: true
     */
    @PostMapping("/catalog/control/createProductFacilityLocation")
    public ResponseEntity<Map<String, Object>> createProductFacilityLocation(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductFeature record
     * <p>service: createProductFeature  entities: ProductFeature  auth: true
     */
    @PostMapping("/catalog/control/createProductFeature")
    public ResponseEntity<Map<String, Object>> createProductFeatureCreateProductFeature(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductFeatureApplAttr
     * <p>service: createProductFeatureApplAttr  entities: ProductFeatureApplAttr  auth: true
     */
    @PostMapping("/catalog/control/createProductFeatureApplAttr")
    public ResponseEntity<Map<String, Object>> createProductFeatureApplAttr(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductFeatureGroup to ProductCategory Application
     * <p>service: createProductFeatureCatGrpAppl  entities: ProductFeatureCatGrpAppl  auth: true
     */
    @PostMapping("/catalog/control/createProductFeatureCatGrpAppl")
    public ResponseEntity<Map<String, Object>> createProductFeatureCatGrpAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductFeatureCategory to ProductCategory Application
     * <p>service: createProductFeatureCategoryAppl  entities: ProductFeatureCategoryAppl  auth: true
     */
    @PostMapping("/catalog/control/createProductFeatureCategoryAppl")
    public ResponseEntity<Map<String, Object>> createProductFeatureCategoryAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductFeatureIactn
     * <p>service: createProductFeatureIactn  entities: ProductFeatureIactn  auth: true
     */
    @PostMapping("/catalog/control/createProductFeatureIactn")
    public ResponseEntity<Map<String, Object>> createProductFeatureIactnCreateProductFeatureIactn(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductFeatureType
     * <p>service: createProductFeatureType  entities: ProductFeatureType  auth: true
     */
    @PostMapping("/catalog/control/createProductFeatureType")
    public ResponseEntity<Map<String, Object>> createProductFeatureType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductGeo
     * <p>service: createProductGeo  entities: ProductGeo  auth: true
     */
    @PostMapping("/catalog/control/createProductGeo")
    public ResponseEntity<Map<String, Object>> createProductGeo(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductGlAccount
     * <p>service: createProductGlAccount  entities: ProductGlAccount  auth: true
     */
    @PostMapping("/catalog/control/createProductGlAccount")
    public ResponseEntity<Map<String, Object>> createProductGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ProductGroupOrder
     * <p>service: createProductGroupOrder  entities: ProductGroupOrder  auth: true
     */
    @PostMapping("/catalog/control/createProductGroupOrder")
    public ResponseEntity<Map<String, Object>> createProductGroupOrder(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createProductInCategory  entities: Product, ProductCategory  auth: true
     */
    @PostMapping("/catalog/control/createProductInCategory")
    public ResponseEntity<Map<String, Object>> createProductInCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductKeyword
     * <p>service: createProductKeyword  entities: ProductKeyword  auth: true
     */
    @PostMapping("/catalog/control/createProductKeyword")
    public ResponseEntity<Map<String, Object>> createProductKeyword(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductMaint
     * <p>service: createProductMaint  entities: ProductMaint  auth: true
     */
    @PostMapping("/catalog/control/createProductMaint")
    public ResponseEntity<Map<String, Object>> createProductMaint(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductMeter
     * <p>service: createProductMeter  entities: ProductMeter  auth: true
     */
    @PostMapping("/catalog/control/createProductMeter")
    public ResponseEntity<Map<String, Object>> createProductMeter(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an ProductPaymentMethodType
     * <p>service: createProductPaymentMethodType  entities: ProductPaymentMethodType  auth: true
     */
    @PostMapping("/catalog/control/createProductPaymentMethodType")
    public ResponseEntity<Map<String, Object>> createProductPaymentMethodType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Product Price. If taxAuthGeoId and taxAuthPartyId are passed in then the price will be considered a price with tax included (the priceWithoutTax, priceWithTax, taxAmount, and taxPercentage fields will also be populated). If the taxInPrice field is 'Y' then the price field will be left with the tax included (price will be equal to priceWithTax), otherwise tax will be removed from the passed in price and the price field will be equal to the priceWithoutTax field. If taxAuthGeoId or taxAuthPartyId empty then the taxInPrice field will be ignored.
     * <p>service: createProductPrice  entities: ProductPrice  auth: true
     */
    @PostMapping("/catalog/control/createProductPrice")
    public ResponseEntity<Map<String, Object>> createProductPrice(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductPriceAction
     * <p>service: createProductPriceAction  entities: ProductPriceAction  auth: true
     */
    @PostMapping("/catalog/control/createProductPriceAction")
    public ResponseEntity<Map<String, Object>> createProductPriceAction(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductPriceCond
     * <p>service: createProductPriceCond  entities: ProductPriceCond  auth: true
     */
    @PostMapping("/catalog/control/createProductPriceCond")
    public ResponseEntity<Map<String, Object>> createProductPriceCond(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductPriceRule
     * <p>service: createProductPriceRule  entities: ProductPriceRule  auth: true
     */
    @PostMapping("/catalog/control/createProductPriceRule")
    public ResponseEntity<Map<String, Object>> createProductPriceRule(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductPromo
     * <p>service: createProductPromo  entities: ProductPromo  auth: true
     */
    @PostMapping("/catalog/control/createProductPromo")
    public ResponseEntity<Map<String, Object>> createProductPromo(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductPromo
     * <p>service: createProductPromoAction  entities: ProductPromoAction  auth: true
     */
    @PostMapping("/catalog/control/createProductPromoAction")
    public ResponseEntity<Map<String, Object>> createProductPromoAction(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductPromoCategory
     * <p>service: createProductPromoCategory  entities: ProductPromoCategory  auth: true
     */
    @PostMapping("/catalog/control/createProductPromoCategory")
    public ResponseEntity<Map<String, Object>> createProductPromoCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductPromoCode
     * <p>service: createProductPromoCode  entities: ProductPromoCode  auth: true
     */
    @PostMapping("/catalog/control/createProductPromoCode")
    public ResponseEntity<Map<String, Object>> createProductPromoCode(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createProductPromoCodeEmail  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/createProductPromoCodeEmail")
    public ResponseEntity<Map<String, Object>> createProductPromoCodeEmail(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductPromoCodeParty
     * <p>service: createProductPromoCodeParty  entities: ProductPromoCodeParty  auth: true
     */
    @PostMapping("/catalog/control/createProductPromoCodeParty")
    public ResponseEntity<Map<String, Object>> createProductPromoCodeParty(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Product Promo Code Set
     * <p>service: createProductPromoCodeSet  entities: ProductPromoCode  auth: true
     */
    @PostMapping("/catalog/control/createProductPromoCodeSet")
    public ResponseEntity<Map<String, Object>> createProductPromoCodeSet(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductPromo
     * <p>service: createProductPromoCond  entities: ProductPromoCond  auth: true
     */
    @PostMapping("/catalog/control/createProductPromoCond")
    public ResponseEntity<Map<String, Object>> createProductPromoCond(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductPromoProduct
     * <p>service: createProductPromoProduct  entities: ProductPromoProduct  auth: true
     */
    @PostMapping("/catalog/control/createProductPromoProduct")
    public ResponseEntity<Map<String, Object>> createProductPromoProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductPromo
     * <p>service: createProductPromoRule  entities: ProductPromoRule  auth: true
     */
    @PostMapping("/catalog/control/createProductPromoRule")
    public ResponseEntity<Map<String, Object>> createProductPromoRule(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Product Store
     * <p>service: createProductStore  entities: ProductStore  auth: true
     */
    @PostMapping("/catalog/control/createProductStore")
    public ResponseEntity<Map<String, Object>> createProductStore(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ProductStoreCatalog
     * <p>service: createProductStoreCatalog  entities: ProductStoreCatalog  auth: true
     */
    @PostMapping("/catalog/control/createProductStoreCatalog")
    public ResponseEntity<Map<String, Object>> createProductStoreCatalogCreateProductStoreCatalog(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Product Store Email Setting
     * <p>service: createProductStoreEmailSetting  entities: ProductStoreEmailSetting  auth: true
     */
    @PostMapping("/catalog/control/createProductStoreEmail")
    public ResponseEntity<Map<String, Object>> createProductStoreEmailSetting(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductStoreGroup
     * <p>service: createProductStoreGroup  entities: ProductStoreGroup  auth: true
     */
    @PostMapping("/catalog/control/createProductStoreGroup")
    public ResponseEntity<Map<String, Object>> createProductStoreGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Product Store Keyword Override
     * <p>service: createProductStoreKeywordOvrd  entities: ProductStoreKeywordOvrd  auth: true
     */
    @PostMapping("/catalog/control/createProductStoreKeywordOvrd")
    public ResponseEntity<Map<String, Object>> createProductStoreKeywordOvrd(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ProductStorePromoAppl
     * <p>service: createProductStorePromoAppl  entities: ProductStorePromoAppl  auth: true
     */
    @PostMapping("/catalog/control/createProductStorePromoAppl")
    public ResponseEntity<Map<String, Object>> createProductStorePromoAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Product Store Survey Appl
     * <p>service: createProductStoreSurveyAppl  entities: ProductStoreSurveyAppl  auth: true
     */
    @PostMapping("/catalog/control/createProductStoreSurveyAppl")
    public ResponseEntity<Map<String, Object>> createProductStoreSurveyAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createProductStoreVendorPayment  entities: ProductStoreVendorPayment  auth: true
     */
    @PostMapping("/catalog/control/createProductStoreVendorPayment")
    public ResponseEntity<Map<String, Object>> createProductStoreVendorPayment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createProductStoreVendorShipment  entities: ProductStoreVendorShipment  auth: true
     */
    @PostMapping("/catalog/control/createProductStoreVendorShipment")
    public ResponseEntity<Map<String, Object>> createProductStoreVendorShipment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductSubscriptionResource Record
     * <p>service: createProductSubscriptionResource  entities: ProductSubscriptionResource  auth: true
     */
    @PostMapping("/catalog/control/createProductSubscriptionResource")
    public ResponseEntity<Map<String, Object>> createProductSubscriptionResource(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ProductSubscriptionResource Record
     * <p>service: createProductSubscriptionResource  entities: ProductSubscriptionResource  auth: true
     */
    @PostMapping("/catalog/control/createProductSubscriptionResourceSr")
    public ResponseEntity<Map<String, Object>> createProductSubscriptionResourceCreateProductSubscriptionResourceSr(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a QuantityBreak
     * <p>service: createQuantityBreak  entities: QuantityBreak  auth: true
     */
    @PostMapping("/catalog/control/createQuantityBreak")
    public ResponseEntity<Map<String, Object>> createQuantityBreak(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Related URL Content For Product Category
     * <p>service: createRelatedUrlContentForCategory  entities: ProductCategoryContent  auth: true
     */
    @PostMapping("/catalog/control/createRelatedUrlContentForCategory")
    public ResponseEntity<Map<String, Object>> createRelatedUrlContentForCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new sales agreement with customer for the product
     * <p>service: createSalesAgreement  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/createSalesAgreement")
    public ResponseEntity<Map<String, Object>> createSalesAgreement(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Creates A ShipmentMethodType
     * <p>service: createShipmentMethodType  entities: ShipmentMethodType  auth: true
     */
    @PostMapping("/catalog/control/createShipmentMethodType")
    public ResponseEntity<Map<String, Object>> createShipmentMethodType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a ShipmentTimeEstimate
     * <p>service: createShipmentTimeEstimate  entities: ShipmentTimeEstimate  auth: true
     */
    @PostMapping("/catalog/control/createShipmentTimeEstimate")
    public ResponseEntity<Map<String, Object>> createShipmentTimeEstimate(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createSimpleTextContentForAlternateLocale  entities: Content  auth: true
     */
    @PostMapping("/catalog/control/createSimpleTextContentForAlternateLocale")
    public ResponseEntity<Map<String, Object>> createSimpleTextContentForAlternateLocale(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createSimpleTextContentForAlternateLocale  entities: Content  auth: true
     */
    @PostMapping("/catalog/control/createSimpleTextContentForAlternateLocaleInCategory")
    public ResponseEntity<Map<String, Object>> createSimpleTextContentForAlternateLocaleCreateSimpleTextContentForAlternateLocaleInCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createSimpleTextContentForCategory  entities: Content, ProductCategoryContent  auth: true
     */
    @PostMapping("/catalog/control/createSimpleTextContentForCategory")
    public ResponseEntity<Map<String, Object>> createSimpleTextContentForCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createSimpleTextContentForProduct  entities: Content, ProductContent  auth: true
     */
    @PostMapping("/catalog/control/createSimpleTextContentForProduct")
    public ResponseEntity<Map<String, Object>> createSimpleTextContentForProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createSimpleTextContentForProductConfigItem  entities: Content, ProdConfItemContent  auth: true
     */
    @PostMapping("/catalog/control/createSimpleTextContentForProductConfigItem")
    public ResponseEntity<Map<String, Object>> createSimpleTextContentForProductConfigItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Subscription Record
     * <p>service: createSubscription  entities: Subscription  auth: true
     */
    @PostMapping("/catalog/control/createSubscription")
    public ResponseEntity<Map<String, Object>> createSubscription(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Subscription Communication Event
     * <p>service: createSubscriptionCommEvent  entities: SubscriptionCommEvent  auth: true
     */
    @PostMapping("/catalog/control/createSubscriptionCommEvent")
    public ResponseEntity<Map<String, Object>> createSubscriptionCommEvent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a SubscriptionResource Record
     * <p>service: createSubscriptionResource  entities: SubscriptionResource  auth: true
     */
    @PostMapping("/catalog/control/createSubscriptionResource")
    public ResponseEntity<Map<String, Object>> createSubscriptionResource(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new SupplierProduct record
     * <p>service: createSupplierProduct  entities: SupplierProduct  auth: true
     */
    @PostMapping("/catalog/control/createSupplierProduct")
    public ResponseEntity<Map<String, Object>> createSupplierProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a new SupplierProductFeature record
     * <p>service: createSupplierProductFeature  entities: SupplierProductFeature  auth: true
     */
    @PostMapping("/catalog/control/createSupplierProductFeature")
    public ResponseEntity<Map<String, Object>> createSupplierProductFeature(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createVendorProduct  entities: VendorProduct  auth: true
     */
    @PostMapping("/catalog/control/createVendorProduct")
    public ResponseEntity<Map<String, Object>> createVendorProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a WorkEffort - Product Assoc, for linking WorkEffort to In or Out Product, for routing it's the link between Manufactured Product with its routings
     * <p>service: createWorkEffortGoodStandard  entities: WorkEffortGoodStandard  auth: true
     */
    @PostMapping("/catalog/control/createWorkEffortGoodStandard")
    public ResponseEntity<Map<String, Object>> createWorkEffortGoodStandard(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Deletes A CarrierShipmentMethod
     * <p>service: deleteCarrierShipmentMethod  entities: CarrierShipmentMethod  auth: true
     */
    @PostMapping("/catalog/control/deleteCarrierShipmentMethod")
    public ResponseEntity<Map<String, Object>> deleteCarrierShipmentMethod(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a CostComponent
     * <p>service: deleteCostComponent  entities: CostComponent  auth: true
     */
    @PostMapping("/catalog/control/deleteCostComponent")
    public ResponseEntity<Map<String, Object>> deleteCostComponent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Feature Price
     * <p>service: deleteFeaturePrice  entities: ProductFeaturePrice  auth: true
     */
    @PostMapping("/catalog/control/deleteFeaturePrice")
    public ResponseEntity<Map<String, Object>> deleteFeaturePrice(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a GoodIdentification
     * <p>service: deleteGoodIdentification  entities: GoodIdentification  auth: true
     */
    @PostMapping("/catalog/control/deleteGoodIdentification")
    public ResponseEntity<Map<String, Object>> deleteGoodIdentification(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Keyword Thesaurus
     * <p>service: deleteKeywordThesaurus  entities: KeywordThesaurus  auth: true
     */
    @PostMapping("/catalog/control/deleteKeywordThesaurus")
    public ResponseEntity<Map<String, Object>> deleteKeywordThesaurus(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ProductStoreCatalog
     * <p>service: deleteProductStoreCatalog  entities: ProductStoreCatalog  auth: true
     */
    @PostMapping("/catalog/control/deleteProdCatalogStore")
    public ResponseEntity<Map<String, Object>> deleteProductStoreCatalog(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: deleteProductAssoc  entities: ProductAssoc  auth: true
     */
    @PostMapping("/catalog/control/deleteProductAssoc")
    public ResponseEntity<Map<String, Object>> deleteProductAssoc(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductAttribute
     * <p>service: deleteProductAttribute  entities: ProductAttribute  auth: true
     */
    @PostMapping("/catalog/control/deleteProductAttribute")
    public ResponseEntity<Map<String, Object>> deleteProductAttribute(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: deleteProductCategoryAttribute  entities: ProductCategoryAttribute  auth: true
     */
    @PostMapping("/catalog/control/deleteProductCategoryAttribute")
    public ResponseEntity<Map<String, Object>> deleteProductCategoryAttribute(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductCategoryLink
     * <p>service: deleteProductCategoryLink  entities: ProductCategoryLink  auth: true
     */
    @PostMapping("/catalog/control/deleteProductCategoryLink")
    public ResponseEntity<Map<String, Object>> deleteProductCategoryLink(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductConfig
     * <p>service: deleteProductConfig  entities: ProductConfig  auth: true
     */
    @PostMapping("/catalog/control/deleteProductConfig")
    public ResponseEntity<Map<String, Object>> deleteProductConfig(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductConfigItem
     * <p>service: deleteProductConfigItem  entities: ProductConfigItem  auth: true
     */
    @PostMapping("/catalog/control/deleteProductConfigItem")
    public ResponseEntity<Map<String, Object>> deleteProductConfigItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Config Option
     * <p>service: deleteProductConfigOption  entities: ProductConfigOption  auth: true
     */
    @PostMapping("/catalog/control/deleteProductConfigOption")
    public ResponseEntity<Map<String, Object>> deleteProductConfigOption(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductConfigProduct
     * <p>service: deleteProductConfigProduct  entities: ProductConfigProduct  auth: true
     */
    @PostMapping("/catalog/control/deleteProductConfigProduct")
    public ResponseEntity<Map<String, Object>> deleteProductConfigProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Example
     * <p>service: deleteProductCostComponentCalc  entities: ProductCostComponentCalc  auth: true
     */
    @PostMapping("/catalog/control/deleteProductCostComponentCalc")
    public ResponseEntity<Map<String, Object>> deleteProductCostComponentCalc(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an ProductFacility
     * <p>service: deleteProductFacility  entities: ProductFacility  auth: true
     */
    @PostMapping("/catalog/control/deleteProductFacility")
    public ResponseEntity<Map<String, Object>> deleteProductFacility(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an ProductFacilityLocation
     * <p>service: deleteProductFacilityLocation  entities: ProductFacilityLocation  auth: true
     */
    @PostMapping("/catalog/control/deleteProductFacilityLocation")
    public ResponseEntity<Map<String, Object>> deleteProductFacilityLocation(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a ProductFeatureApplAttr
     * <p>service: removeProductFeatureApplAttr  entities: ProductFeatureApplAttr  auth: true
     */
    @PostMapping("/catalog/control/deleteProductFeatureApplAttr")
    public ResponseEntity<Map<String, Object>> removeProductFeatureApplAttr(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductGeo
     * <p>service: deleteProductGeo  entities: ProductGeo  auth: true
     */
    @PostMapping("/catalog/control/deleteProductGeo")
    public ResponseEntity<Map<String, Object>> deleteProductGeo(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductGlAccount
     * <p>service: deleteProductGlAccount  entities: ProductGlAccount  auth: true
     */
    @PostMapping("/catalog/control/deleteProductGlAccount")
    public ResponseEntity<Map<String, Object>> deleteProductGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ProductGroupOrder
     * <p>service: deleteProductGroupOrder  entities: ProductGroupOrder  auth: true
     */
    @PostMapping("/catalog/control/deleteProductGroupOrder")
    public ResponseEntity<Map<String, Object>> deleteProductGroupOrder(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductKeyword
     * <p>service: deleteProductKeyword  entities: ProductKeyword  auth: true
     */
    @PostMapping("/catalog/control/deleteProductKeyword")
    public ResponseEntity<Map<String, Object>> deleteProductKeyword(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete all the keywords of a product
     * <p>service: deleteProductKeywords  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/deleteProductKeywords")
    public ResponseEntity<Map<String, Object>> deleteProductKeywords(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductMaint
     * <p>service: deleteProductMaint  entities: ProductMaint  auth: true
     */
    @PostMapping("/catalog/control/deleteProductMaint")
    public ResponseEntity<Map<String, Object>> deleteProductMaint(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductMeter
     * <p>service: deleteProductMeter  entities: ProductMeter  auth: true
     */
    @PostMapping("/catalog/control/deleteProductMeter")
    public ResponseEntity<Map<String, Object>> deleteProductMeter(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an ProductPaymentMethodType
     * <p>service: deleteProductPaymentMethodType  entities: ProductPaymentMethodType  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPaymentMethodType")
    public ResponseEntity<Map<String, Object>> deleteProductPaymentMethodType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an ProductPrice
     * <p>service: deleteProductPrice  entities: ProductPrice  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPrice")
    public ResponseEntity<Map<String, Object>> deleteProductPrice(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductPriceAction
     * <p>service: deleteProductPriceAction  entities: ProductPriceAction  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPriceAction")
    public ResponseEntity<Map<String, Object>> deleteProductPriceAction(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductPriceCond
     * <p>service: deleteProductPriceCond  entities: ProductPriceCond  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPriceCond")
    public ResponseEntity<Map<String, Object>> deleteProductPriceCond(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductPriceRule
     * <p>service: deleteProductPriceRule  entities: ProductPriceRule  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPriceRule")
    public ResponseEntity<Map<String, Object>> deleteProductPriceRule(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductPromo
     * <p>service: deleteProductPromoAction  entities: ProductPromoAction  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPromoAction")
    public ResponseEntity<Map<String, Object>> deleteProductPromoAction(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductPromoCategory
     * <p>service: deleteProductPromoCategory  entities: ProductPromoCategory  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPromoCategory")
    public ResponseEntity<Map<String, Object>> deleteProductPromoCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductPromoCode
     * <p>service: deleteProductPromoCode  entities: ProductPromoCode  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPromoCode")
    public ResponseEntity<Map<String, Object>> deleteProductPromoCode(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProdPromoCodeContactMech
     * <p>service: deleteProductPromoCodeContactMech  entities: ProdPromoCodeContactMech  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPromoCodeEmail")
    public ResponseEntity<Map<String, Object>> deleteProductPromoCodeContactMech(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductPromoCodeParty
     * <p>service: deleteProductPromoCodeParty  entities: ProductPromoCodeParty  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPromoCodeParty")
    public ResponseEntity<Map<String, Object>> deleteProductPromoCodeParty(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductPromo
     * <p>service: deleteProductPromoCond  entities: ProductPromoCond  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPromoCond")
    public ResponseEntity<Map<String, Object>> deleteProductPromoCond(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductPromoProduct
     * <p>service: deleteProductPromoProduct  entities: ProductPromoProduct  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPromoProduct")
    public ResponseEntity<Map<String, Object>> deleteProductPromoProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductPromo
     * <p>service: deleteProductPromoRule  entities: ProductPromoRule  auth: true
     */
    @PostMapping("/catalog/control/deleteProductPromoRule")
    public ResponseEntity<Map<String, Object>> deleteProductPromoRule(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ProductStoreCatalog
     * <p>service: deleteProductStoreCatalog  entities: ProductStoreCatalog  auth: true
     */
    @PostMapping("/catalog/control/deleteProductStoreCatalog")
    public ResponseEntity<Map<String, Object>> deleteProductStoreCatalogDeleteProductStoreCatalog(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductStoreFacility
     * <p>service: deleteProductStoreFacility  entities: ProductStoreFacility  auth: true
     */
    @PostMapping("/catalog/control/deleteProductStoreFacility")
    public ResponseEntity<Map<String, Object>> deleteProductStoreFacility(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Product Store Keyword Override
     * <p>service: deleteProductStoreKeywordOvrd  entities: ProductStoreKeywordOvrd  auth: true
     */
    @PostMapping("/catalog/control/deleteProductStoreKeywordOvrd")
    public ResponseEntity<Map<String, Object>> deleteProductStoreKeywordOvrd(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ProductStorePromoAppl
     * <p>service: deleteProductStorePromoAppl  entities: ProductStorePromoAppl  auth: true
     */
    @PostMapping("/catalog/control/deleteProductStorePromoAppl")
    public ResponseEntity<Map<String, Object>> deleteProductStorePromoAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a Product Store Survey Appl
     * <p>service: deleteProductStoreSurveyAppl  entities: ProductStoreSurveyAppl  auth: true
     */
    @PostMapping("/catalog/control/deleteProductStoreSurveyAppl")
    public ResponseEntity<Map<String, Object>> deleteProductStoreSurveyAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: deleteProductStoreVendorPayment  entities: ProductStoreVendorPayment  auth: true
     */
    @PostMapping("/catalog/control/deleteProductStoreVendorPayment")
    public ResponseEntity<Map<String, Object>> deleteProductStoreVendorPayment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: deleteProductStoreVendorShipment  entities: ProductStoreVendorShipment  auth: true
     */
    @PostMapping("/catalog/control/deleteProductStoreVendorShipment")
    public ResponseEntity<Map<String, Object>> deleteProductStoreVendorShipment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductSubscriptionResource Record
     * <p>service: deleteProductSubscriptionResource  entities: ProductSubscriptionResource  auth: true
     */
    @PostMapping("/catalog/control/deleteProductSubscriptionResource")
    public ResponseEntity<Map<String, Object>> deleteProductSubscriptionResource(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a ProductSubscriptionResource Record
     * <p>service: deleteProductSubscriptionResource  entities: ProductSubscriptionResource  auth: true
     */
    @PostMapping("/catalog/control/deleteProductSubscriptionResourceSr")
    public ResponseEntity<Map<String, Object>> deleteProductSubscriptionResourceDeleteProductSubscriptionResourceSr(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a QuantityBreak
     * <p>service: deleteQuantityBreak  entities: QuantityBreak  auth: true
     */
    @PostMapping("/catalog/control/deleteQuantityBreak")
    public ResponseEntity<Map<String, Object>> deleteQuantityBreak(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Deletes A ShipmentMethodType
     * <p>service: deleteShipmentMethodType  entities: ShipmentMethodType  auth: true
     */
    @PostMapping("/catalog/control/deleteShipmentMethodType")
    public ResponseEntity<Map<String, Object>> deleteShipmentMethodType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: deleteVendorProduct  entities: VendorProduct  auth: true
     */
    @PostMapping("/catalog/control/deleteVendorProduct")
    public ResponseEntity<Map<String, Object>> deleteVendorProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Expire All Product Members in a Category optionally using the thruDate specified as the expire date (now timestamp used by default)
     * <p>service: expireAllCategoryProductMembers  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/expireAllCategoryProductMembers")
    public ResponseEntity<Map<String, Object>> expireAllCategoryProductMembers(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Expire a ShipmentTimeEstimate
     * <p>service: expireShipmentTimeEstimate  entities: ShipmentTimeEstimate  auth: true
     */
    @PostMapping("/catalog/control/expireShipmentTimeEstimate")
    public ResponseEntity<Map<String, Object>> expireShipmentTimeEstimate(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Induce all the keywords of a product, ignoring the flag in the Product.autoCreateKeywords flag
     * <p>service: forceIndexProductKeywords  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/forceIndexProductKeywords")
    public ResponseEntity<Map<String, Object>> forceIndexProductKeywords(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Set the Value options for selected Price Rule Condition Input
     * <p>service: getAssociatedPriceRulesConds  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/getAssociatedPriceRulesConds")
    public ResponseEntity<Map<String, Object>> getAssociatedPriceRulesConds(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: getChildCategoryTree  entities: unknown  auth: false
     */
    @GetMapping("/catalog/control/getChild")
    public ResponseEntity<Map<String, Object>> getChildCategoryTree(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: getChildProductStoreGroupTree  entities: unknown  auth: false
     */
    @GetMapping("/catalog/control/getProductStoreGroupRollupHierarchy")
    public ResponseEntity<Map<String, Object>> getChildProductStoreGroupTree(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: -  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/prepareCreateShipMeth")
    public ResponseEntity<Map<String, Object>> prepareCreateShipMeth(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: -  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/prepareCreateShipmentTimeEstimate")
    public ResponseEntity<Map<String, Object>> prepareCreateShipmentTimeEstimate(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: previewFrameImage  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/previewFrameImage")
    public ResponseEntity<Map<String, Object>> previewFrameImage(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ProductStorePromoAppl
     * <p>service: createProductStorePromoAppl  entities: ProductStorePromoAppl  auth: true
     */
    @PostMapping("/catalog/control/promo_createProductStorePromoAppl")
    public ResponseEntity<Map<String, Object>> createProductStorePromoApplPromoCreateProductStorePromoAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ProductStorePromoAppl
     * <p>service: deleteProductStorePromoAppl  entities: ProductStorePromoAppl  auth: true
     */
    @PostMapping("/catalog/control/promo_deleteProductStorePromoAppl")
    public ResponseEntity<Map<String, Object>> deleteProductStorePromoApplPromoDeleteProductStorePromoAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ProductStorePromoAppl
     * <p>service: updateProductStorePromoAppl  entities: ProductStorePromoAppl  auth: true
     */
    @PostMapping("/catalog/control/promo_updateProductStorePromoAppl")
    public ResponseEntity<Map<String, Object>> updateProductStorePromoAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addProductToCategories  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/quickAdminAddCategories")
    public ResponseEntity<Map<String, Object>> addProductToCategories(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addProductFeatures  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/quickAdminApplyFeatureToProduct")
    public ResponseEntity<Map<String, Object>> addProductFeatures(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a ProductFeature from a Product
     * <p>service: removeFeatureFromProduct  entities: ProductFeatureAppl  auth: true
     */
    @PostMapping("/catalog/control/quickAdminRemoveFeatureFromProduct")
    public ResponseEntity<Map<String, Object>> removeFeatureFromProductQuickAdminRemoveFeatureFromProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: removeProductFeatureAppl  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/quickAdminRemoveProductFeature")
    public ResponseEntity<Map<String, Object>> removeProductFeatureAppl(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Product From Category
     * <p>service: removeProductFromCategory  entities: ProductCategoryMember  auth: true
     */
    @PostMapping("/catalog/control/quickAdminRemoveProductFromCategory")
    public ResponseEntity<Map<String, Object>> removeProductFromCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateProductCategoryMember  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/quickAdminUnPublish")
    public ResponseEntity<Map<String, Object>> updateProductCategoryMember(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateProductAssoc  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/quickAdminUpdateProductAssoc")
    public ResponseEntity<Map<String, Object>> updateProductAssoc(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * This will create a virtual product and return its ID, and associate all of the variants with it. It will not put the selectable features on the virtual or standard features on the variant.
     * <p>service: quickCreateVirtualWithVariants  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/quickCreateVirtualWithVariants")
    public ResponseEntity<Map<String, Object>> quickCreateVirtualWithVariantsQuickCreateVirtualWithVariants(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Product From Category
     * <p>service: removeProductFromCategory  entities: ProductCategoryMember  auth: true
     */
    @PostMapping("/catalog/control/removeCategoryProductMember")
    public ResponseEntity<Map<String, Object>> removeProductFromCategoryRemoveCategoryProductMember(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Content From Category
     * <p>service: removeCategoryContent  entities: ProductCategoryContent  auth: true
     */
    @PostMapping("/catalog/control/removeContentFromCategory")
    public ResponseEntity<Map<String, Object>> removeCategoryContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Content From Product
     * <p>service: removeProductContent  entities: ProductContent  auth: true
     */
    @PostMapping("/catalog/control/removeContentFromProduct")
    public ResponseEntity<Map<String, Object>> removeProductContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Content From ProductConfigItem
     * <p>service: removeProductConfigItemContent  entities: ProdConfItemContent  auth: true
     */
    @PostMapping("/catalog/control/removeContentFromProductConfigItem")
    public ResponseEntity<Map<String, Object>> removeProductConfigItemContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Cancel by the thru date a Product Promo Content
     * <p>service: removeProductPromoContent  entities: ProductPromoContent  auth: true
     */
    @PostMapping("/catalog/control/removeContentFromProductPromo")
    public ResponseEntity<Map<String, Object>> removeProductPromoContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove All Expired Product Members in a Category, optionally uses the valid date instead of now to determine if the member has expired
     * <p>service: removeExpiredCategoryProductMembers  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/removeExpiredCategoryProductMembers")
    public ResponseEntity<Map<String, Object>> removeExpiredCategoryProductMembers(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a ProductFeatureIactn
     * <p>service: removeProductFeatureIactn  entities: ProductFeatureIactn  auth: true
     */
    @PostMapping("/catalog/control/removeFeatureIactn")
    public ResponseEntity<Map<String, Object>> removeProductFeatureIactn(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Product From Fixed Asset
     * <p>service: removeFixedAssetProduct  entities: FixedAssetProduct  auth: true
     */
    @PostMapping("/catalog/control/removeFixedAssetProduct")
    public ResponseEntity<Map<String, Object>> removeFixedAssetProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Content From Product and File Image
     * <p>service: removeProductContentAndImageFile  entities: ProductContent  auth: true
     */
    @PostMapping("/catalog/control/removeImage")
    public ResponseEntity<Map<String, Object>> removeProductContentAndImageFile(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Image By Size.
     * <p>service: removeImageBySize  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/removeImageBySize")
    public ResponseEntity<Map<String, Object>> removeImageBySize(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Content From Product and File Image
     * <p>service: removeProductContentAndImageFile  entities: ProductContent  auth: true
     */
    @PostMapping("/catalog/control/removeImageUpload")
    public ResponseEntity<Map<String, Object>> removeProductContentAndImageFileRemoveImageUpload(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Party From Category
     * <p>service: removePartyFromCategory  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/removePartyFromCategory")
    public ResponseEntity<Map<String, Object>> removePartyFromCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Party From Product
     * <p>service: removePartyFromProduct  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/removePartyFromProduct")
    public ResponseEntity<Map<String, Object>> removePartyFromProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ProdCatalog From Party
     * <p>service: removeProdCatalogFromParty  entities: ProdCatalogRole  auth: true
     */
    @PostMapping("/catalog/control/removeProdCatalogFromParty")
    public ResponseEntity<Map<String, Object>> removeProdCatalogFromParty(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ProductCategory From Category
     * <p>service: removeProductCategoryFromCategory  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/removeProductCategoryFromCategory")
    public ResponseEntity<Map<String, Object>> removeProductCategoryFromCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ProductCategory From ProdCatalog
     * <p>service: removeProductCategoryFromProdCatalog  entities: ProdCatalogCategory  auth: true
     */
    @PostMapping("/catalog/control/removeProductCategoryFromProdCatalog")
    public ResponseEntity<Map<String, Object>> removeProductCategoryFromProdCatalogRemoveProductCategoryFromProdCatalog(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a ProductFeatureGroup to ProductCategory Application
     * <p>service: removeProductFeatureCatGrpAppl  entities: ProductFeatureCatGrpAppl  auth: true
     */
    @PostMapping("/catalog/control/removeProductFeatureCatGrpAppl")
    public ResponseEntity<Map<String, Object>> removeProductFeatureCatGrpAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a ProductFeatureCategory to ProductCategory Application
     * <p>service: removeProductFeatureCategoryAppl  entities: ProductFeatureCategoryAppl  auth: true
     */
    @PostMapping("/catalog/control/removeProductFeatureCategoryAppl")
    public ResponseEntity<Map<String, Object>> removeProductFeatureCategoryAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a ProductFeatureIactn
     * <p>service: removeProductFeatureIactn  entities: ProductFeatureIactn  auth: true
     */
    @PostMapping("/catalog/control/removeProductFeatureIactn")
    public ResponseEntity<Map<String, Object>> removeProductFeatureIactnRemoveProductFeatureIactn(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a ProductFeatureType
     * <p>service: removeProductFeatureType  entities: ProductFeatureType  auth: true
     */
    @PostMapping("/catalog/control/removeProductFeatureType")
    public ResponseEntity<Map<String, Object>> removeProductFeatureType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Product From Category
     * <p>service: removeProductFromCategory  entities: ProductCategoryMember  auth: true
     */
    @PostMapping("/catalog/control/removeProductFromCategory")
    public ResponseEntity<Map<String, Object>> removeProductFromCategoryRemoveProductFromCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a Product Store Email Setting
     * <p>service: removeProductStoreEmailSetting  entities: ProductStoreEmailSetting  auth: true
     */
    @PostMapping("/catalog/control/removeProductStoreEmail")
    public ResponseEntity<Map<String, Object>> removeProductStoreEmailSetting(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a Subscription Communication Event
     * <p>service: removeSubscriptionCommEvent  entities: SubscriptionCommEvent  auth: true
     */
    @PostMapping("/catalog/control/removeSubscriptionCommEvent")
    public ResponseEntity<Map<String, Object>> removeSubscriptionCommEvent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a SupplierProduct record
     * <p>service: removeSupplierProduct  entities: SupplierProduct  auth: true
     */
    @PostMapping("/catalog/control/removeSupplierProduct")
    public ResponseEntity<Map<String, Object>> removeSupplierProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a SupplierProduct record
     * <p>service: removeSupplierProductFeature  entities: SupplierProductFeature  auth: true
     */
    @PostMapping("/catalog/control/removeSupplierProductFeature")
    public ResponseEntity<Map<String, Object>> removeSupplierProductFeature(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a WorkEffort - Product Assoc, for linking WorkEffort to In or Out Product, for routing it's the link between Manufactured Product with its routings
     * <p>service: removeWorkEffortGoodStandard  entities: WorkEffortGoodStandard  auth: true
     */
    @PostMapping("/catalog/control/removeWorkEffortGoodStandard")
    public ResponseEntity<Map<String, Object>> removeWorkEffortGoodStandard(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Rename Image.
     * <p>service: renameImage  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/renameImage")
    public ResponseEntity<Map<String, Object>> renameImage(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Resize Image Of Product.
     * <p>service: replaceImageToExistImage  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/replaceImageToExistImage")
    public ResponseEntity<Map<String, Object>> replaceImageToExistImage(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Resize Images.
     * <p>service: resizeImages  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/resizeImages")
    public ResponseEntity<Map<String, Object>> resizeImages(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: searchAddFeature  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/searchAddFeature")
    public ResponseEntity<Map<String, Object>> searchAddFeature(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: searchAddToCategory  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/searchAddToCategory")
    public ResponseEntity<Map<String, Object>> searchAddToCategory(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: searchExpireFromCategory  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/searchExpireFromCategory")
    public ResponseEntity<Map<String, Object>> searchExpireFromCategory(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: searchExportProductList  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/searchExportProductList")
    public ResponseEntity<Map<String, Object>> searchExportProductList(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: searchRemoveFeature  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/searchRemoveFeature")
    public ResponseEntity<Map<String, Object>> searchRemoveFeature(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: searchRemoveFromCategory  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/searchRemoveFromCategory")
    public ResponseEntity<Map<String, Object>> searchRemoveFromCategory(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: setDefaultImage  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/setDefaultImage")
    public ResponseEntity<Map<String, Object>> setDefaultImage(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: setImageDetail  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/setImageDetail")
    public ResponseEntity<Map<String, Object>> setImageDetail(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ProductStorePaymentSetting
     * <p>service: createProductStorePaymentSetting  entities: ProductStorePaymentSetting  auth: true
     */
    @PostMapping("/catalog/control/storeCreatePaySetting")
    public ResponseEntity<Map<String, Object>> createProductStorePaymentSetting(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ProductStoreRole
     * <p>service: createProductStoreRole  entities: ProductStoreRole  auth: true
     */
    @PostMapping("/catalog/control/storeCreateRole")
    public ResponseEntity<Map<String, Object>> createProductStoreRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Product Store Shipment Method
     * <p>service: createProductStoreShipMeth  entities: ProductStoreShipmentMeth  auth: true
     */
    @PostMapping("/catalog/control/storeCreateShipMeth")
    public ResponseEntity<Map<String, Object>> createProductStoreShipMeth(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Shipment Estimate
     * <p>service: createShipmentEstimate  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/storeCreateShipRate")
    public ResponseEntity<Map<String, Object>> createShipmentEstimate(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ProductStorePaymentSetting
     * <p>service: deleteProductStorePaymentSetting  entities: ProductStorePaymentSetting  auth: true
     */
    @PostMapping("/catalog/control/storeRemovePaySetting")
    public ResponseEntity<Map<String, Object>> deleteProductStorePaymentSetting(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove ProductStoreRole
     * <p>service: removeProductStoreRole  entities: ProductStoreRole  auth: true
     */
    @PostMapping("/catalog/control/storeRemoveRole")
    public ResponseEntity<Map<String, Object>> removeProductStoreRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove a Product Store Shipment Method
     * <p>service: removeProductStoreShipMeth  entities: ProductStoreShipmentMeth  auth: true
     */
    @PostMapping("/catalog/control/storeRemoveShipMeth")
    public ResponseEntity<Map<String, Object>> removeProductStoreShipMeth(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Shipment Estimate
     * <p>service: removeShipmentEstimate  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/storeRemoveShipRate")
    public ResponseEntity<Map<String, Object>> removeShipmentEstimate(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ProductStorePaymentSetting
     * <p>service: updateProductStorePaymentSetting  entities: ProductStorePaymentSetting  auth: true
     */
    @PostMapping("/catalog/control/storeUpdatePaySetting")
    public ResponseEntity<Map<String, Object>> updateProductStorePaymentSetting(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Product Store Role
     * <p>service: updateProductStoreRole  entities: ProductStoreRole  auth: true
     */
    @PostMapping("/catalog/control/storeUpdateRole")
    public ResponseEntity<Map<String, Object>> updateProductStoreRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Product Store Shipment Method
     * <p>service: updateProductStoreShipMeth  entities: ProductStoreShipmentMeth  auth: true
     */
    @PostMapping("/catalog/control/storeUpdateShipMeth")
    public ResponseEntity<Map<String, Object>> updateProductStoreShipMeth(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a WebSite
     * <p>service: updateWebSite  entities: WebSite  auth: true
     */
    @PostMapping("/catalog/control/storeUpdateWebSite")
    public ResponseEntity<Map<String, Object>> updateWebSite(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update the Product to Fixed Asset information
     * <p>service: updateFixedAssetProduct  entities: FixedAssetProduct  auth: true
     */
    @PostMapping("/catalog/control/updFixedAssetProduct")
    public ResponseEntity<Map<String, Object>> updateFixedAssetProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Updates A CarrierShipmentMethod
     * <p>service: updateCarrierShipmentMethod  entities: CarrierShipmentMethod  auth: true
     */
    @PostMapping("/catalog/control/updateCarrierShipmentMethod")
    public ResponseEntity<Map<String, Object>> updateCarrierShipmentMethod(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an ProductCategory
     * <p>service: updateProductCategory  entities: ProductCategory  auth: true
     */
    @PostMapping("/catalog/control/updateCategoryContent")
    public ResponseEntity<Map<String, Object>> updateProductCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateProductToCategory  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/updateCategoryProductMember")
    public ResponseEntity<Map<String, Object>> updateProductToCategory(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update SEO Content For Product Category
     * <p>service: updateContentSEOForCategory  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/updateContentSEOForCategory")
    public ResponseEntity<Map<String, Object>> updateContentSEOForCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Product SEO
     * <p>service: updateContentSEOForProduct  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/updateContentSEOForProduct")
    public ResponseEntity<Map<String, Object>> updateContentSEOForProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Content To Category
     * <p>service: updateCategoryContent  entities: Content, ProductCategoryContent  auth: true
     */
    @PostMapping("/catalog/control/updateContentToCategory")
    public ResponseEntity<Map<String, Object>> updateCategoryContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Content To Product
     * <p>service: updateProductContent  entities: Content, ProductContent  auth: true
     */
    @PostMapping("/catalog/control/updateContentToProduct")
    public ResponseEntity<Map<String, Object>> updateProductContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Content To ProductConfigItem
     * <p>service: updateProductConfigItemContent  entities: Content, ProdConfItemContent  auth: true
     */
    @PostMapping("/catalog/control/updateContentToProductConfigItem")
    public ResponseEntity<Map<String, Object>> updateProductConfigItemContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a CostComponent
     * <p>service: updateCostComponent  entities: CostComponent  auth: true
     */
    @PostMapping("/catalog/control/updateCostComponent")
    public ResponseEntity<Map<String, Object>> updateCostComponent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateDownloadContentForCategory  entities: Content, ProductCategoryContent  auth: true
     */
    @PostMapping("/catalog/control/updateDownloadContentForCategory")
    public ResponseEntity<Map<String, Object>> updateDownloadContentForCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Download Content For Product
     * <p>service: updateDownloadContentForProduct  entities: ProductContent  auth: true
     */
    @PostMapping("/catalog/control/updateDownloadContentForProduct")
    public ResponseEntity<Map<String, Object>> updateDownloadContentForProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Email Content For Product
     * <p>service: updateEmailContentForProduct  entities: ProductContent  auth: true
     */
    @PostMapping("/catalog/control/updateEmailContentForProduct")
    public ResponseEntity<Map<String, Object>> updateEmailContentForProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Content To Product
     * <p>service: updateProductContent  entities: Content, ProductContent  auth: true
     */
    @PostMapping("/catalog/control/updateExternalContentForProduct")
    public ResponseEntity<Map<String, Object>> updateProductContentUpdateExternalContentForProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Feature Price
     * <p>service: updateFeaturePrice  entities: ProductFeaturePrice  auth: true
     */
    @PostMapping("/catalog/control/updateFeaturePrice")
    public ResponseEntity<Map<String, Object>> updateFeaturePrice(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a GoodIdentification
     * <p>service: updateGoodIdentification  entities: GoodIdentification  auth: true
     */
    @PostMapping("/catalog/control/updateGoodIdentification")
    public ResponseEntity<Map<String, Object>> updateGoodIdentification(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Party To Category
     * <p>service: updatePartyToCategory  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/updatePartyToCategory")
    public ResponseEntity<Map<String, Object>> updatePartyToCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Party To Product
     * <p>service: updatePartyToProduct  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/updatePartyToProduct")
    public ResponseEntity<Map<String, Object>> updatePartyToProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an ProdCatalog
     * <p>service: updateProdCatalog  entities: ProdCatalog  auth: true
     */
    @PostMapping("/catalog/control/updateProdCatalog")
    public ResponseEntity<Map<String, Object>> updateProdCatalog(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ProductStoreCatalog
     * <p>service: updateProductStoreCatalog  entities: ProductStoreCatalog  auth: true
     */
    @PostMapping("/catalog/control/updateProdCatalogStore")
    public ResponseEntity<Map<String, Object>> updateProductStoreCatalog(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add ProdCatalog To Party
     * <p>service: updateProdCatalogToParty  entities: ProdCatalogRole  auth: true
     */
    @PostMapping("/catalog/control/updateProdCatalogToParty")
    public ResponseEntity<Map<String, Object>> updateProdCatalogToParty(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Product
     * <p>service: updateProduct  entities: Product  auth: true
     */
    @PostMapping("/catalog/control/updateProduct")
    public ResponseEntity<Map<String, Object>> updateProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Product
     * <p>service: updateProduct  entities: Product  auth: true
     */
    @PostMapping("/catalog/control/updateProductAssetUsage")
    public ResponseEntity<Map<String, Object>> updateProductUpdateProductAssetUsage(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateProductAssoc  entities: ProductAssoc  auth: true
     */
    @PostMapping("/catalog/control/updateProductAssoc")
    public ResponseEntity<Map<String, Object>> updateProductAssocUpdateProductAssoc(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductAttribute
     * <p>service: updateProductAttribute  entities: ProductAttribute  auth: true
     */
    @PostMapping("/catalog/control/updateProductAttribute")
    public ResponseEntity<Map<String, Object>> updateProductAttribute(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an ProductCategory
     * <p>service: updateProductCategory  entities: ProductCategory  auth: true
     */
    @PostMapping("/catalog/control/updateProductCategory")
    public ResponseEntity<Map<String, Object>> updateProductCategoryUpdateProductCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateProductCategoryAttribute  entities: ProductCategoryAttribute  auth: true
     */
    @PostMapping("/catalog/control/updateProductCategoryAttribute")
    public ResponseEntity<Map<String, Object>> updateProductCategoryAttribute(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductCategoryLink
     * <p>service: updateProductCategoryLink  entities: ProductCategoryLink  auth: true
     */
    @PostMapping("/catalog/control/updateProductCategoryLink")
    public ResponseEntity<Map<String, Object>> updateProductCategoryLink(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateProductCategoryToCategory  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/updateProductCategoryToCategory")
    public ResponseEntity<Map<String, Object>> updateProductCategoryToCategory(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add ProductCategory To ProdCatalog
     * <p>service: updateProductCategoryToProdCatalog  entities: ProdCatalogCategory  auth: true
     */
    @PostMapping("/catalog/control/updateProductCategoryToProdCatalog")
    public ResponseEntity<Map<String, Object>> updateProductCategoryToProdCatalogUpdateProductCategoryToProdCatalog(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductConfig
     * <p>service: updateProductConfig  entities: ProductConfig  auth: true
     */
    @PostMapping("/catalog/control/updateProductConfig")
    public ResponseEntity<Map<String, Object>> updateProductConfig(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductConfigItem
     * <p>service: updateProductConfigItem  entities: ProductConfigItem  auth: true
     */
    @PostMapping("/catalog/control/updateProductConfigItem")
    public ResponseEntity<Map<String, Object>> updateProductConfigItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductConfigItem
     * <p>service: updateProductConfigItem  entities: ProductConfigItem  auth: true
     */
    @PostMapping("/catalog/control/updateProductConfigItemContent")
    public ResponseEntity<Map<String, Object>> updateProductConfigItemUpdateProductConfigItemContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Config Option
     * <p>service: updateProductConfigOption  entities: ProductConfigOption  auth: true
     */
    @PostMapping("/catalog/control/updateProductConfigOption")
    public ResponseEntity<Map<String, Object>> updateProductConfigOption(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductConfigProduct
     * <p>service: updateProductConfigProduct  entities: ProductConfigProduct  auth: true
     */
    @PostMapping("/catalog/control/updateProductConfigProduct")
    public ResponseEntity<Map<String, Object>> updateProductConfigProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Product
     * <p>service: updateProduct  entities: Product  auth: true
     */
    @PostMapping("/catalog/control/updateProductContent")
    public ResponseEntity<Map<String, Object>> updateProductUpdateProductContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductCostComponentCalc
     * <p>service: updateProductCostComponentCalc  entities: ProductCostComponentCalc  auth: true
     */
    @PostMapping("/catalog/control/updateProductCostComponentCalc")
    public ResponseEntity<Map<String, Object>> updateProductCostComponentCalc(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an ProductFacility
     * <p>service: updateProductFacility  entities: ProductFacility  auth: true
     */
    @PostMapping("/catalog/control/updateProductFacility")
    public ResponseEntity<Map<String, Object>> updateProductFacility(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an ProductFacilityLocation
     * <p>service: updateProductFacilityLocation  entities: ProductFacilityLocation  auth: true
     */
    @PostMapping("/catalog/control/updateProductFacilityLocation")
    public ResponseEntity<Map<String, Object>> updateProductFacilityLocation(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductFeature record
     * <p>service: updateProductFeature  entities: ProductFeature  auth: true
     */
    @PostMapping("/catalog/control/updateProductFeature")
    public ResponseEntity<Map<String, Object>> updateProductFeatureUpdateProductFeature(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductFeatureGroup to ProductCategory Application
     * <p>service: updateProductFeatureCatGrpAppl  entities: ProductFeatureCatGrpAppl  auth: true
     */
    @PostMapping("/catalog/control/updateProductFeatureCatGrpAppl")
    public ResponseEntity<Map<String, Object>> updateProductFeatureCatGrpAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductFeatureCategory to ProductCategory Application
     * <p>service: updateProductFeatureCategoryAppl  entities: ProductFeatureCategoryAppl  auth: true
     */
    @PostMapping("/catalog/control/updateProductFeatureCategoryAppl")
    public ResponseEntity<Map<String, Object>> updateProductFeatureCategoryAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductFeatureType
     * <p>service: updateProductFeatureType  entities: ProductFeatureType  auth: true
     */
    @PostMapping("/catalog/control/updateProductFeatureType")
    public ResponseEntity<Map<String, Object>> updateProductFeatureType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductGeo
     * <p>service: updateProductGeo  entities: ProductGeo  auth: true
     */
    @PostMapping("/catalog/control/updateProductGeo")
    public ResponseEntity<Map<String, Object>> updateProductGeo(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductGlAccount
     * <p>service: updateProductGlAccount  entities: ProductGlAccount  auth: true
     */
    @PostMapping("/catalog/control/updateProductGlAccount")
    public ResponseEntity<Map<String, Object>> updateProductGlAccount(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ProductGroupOrder
     * <p>service: updateProductGroupOrder  entities: ProductGroupOrder  auth: true
     */
    @PostMapping("/catalog/control/updateProductGroupOrder")
    public ResponseEntity<Map<String, Object>> updateProductGroupOrder(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductKeyword
     * <p>service: updateProductKeyword  entities: ProductKeyword  auth: true
     */
    @PostMapping("/catalog/control/updateProductKeyword")
    public ResponseEntity<Map<String, Object>> updateProductKeyword(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductMaint
     * <p>service: updateProductMaint  entities: ProductMaint  auth: true
     */
    @PostMapping("/catalog/control/updateProductMaint")
    public ResponseEntity<Map<String, Object>> updateProductMaint(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductMeter
     * <p>service: updateProductMeter  entities: ProductMeter  auth: true
     */
    @PostMapping("/catalog/control/updateProductMeter")
    public ResponseEntity<Map<String, Object>> updateProductMeter(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an ProductPaymentMethodType
     * <p>service: updateProductPaymentMethodType  entities: ProductPaymentMethodType  auth: true
     */
    @PostMapping("/catalog/control/updateProductPaymentMethodType")
    public ResponseEntity<Map<String, Object>> updateProductPaymentMethodType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an ProductPrice
     * <p>service: updateProductPrice  entities: ProductPrice  auth: true
     */
    @PostMapping("/catalog/control/updateProductPrice")
    public ResponseEntity<Map<String, Object>> updateProductPrice(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductPriceAction
     * <p>service: updateProductPriceAction  entities: ProductPriceAction  auth: true
     */
    @PostMapping("/catalog/control/updateProductPriceAction")
    public ResponseEntity<Map<String, Object>> updateProductPriceAction(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductPriceCond
     * <p>service: updateProductPriceCond  entities: ProductPriceCond  auth: true
     */
    @PostMapping("/catalog/control/updateProductPriceCond")
    public ResponseEntity<Map<String, Object>> updateProductPriceCond(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductPriceRule
     * <p>service: updateProductPriceRule  entities: ProductPriceRule  auth: true
     */
    @PostMapping("/catalog/control/updateProductPriceRule")
    public ResponseEntity<Map<String, Object>> updateProductPriceRule(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductPromo
     * <p>service: updateProductPromo  entities: ProductPromo  auth: true
     */
    @PostMapping("/catalog/control/updateProductPromo")
    public ResponseEntity<Map<String, Object>> updateProductPromo(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductPromo
     * <p>service: updateProductPromoAction  entities: ProductPromoAction  auth: true
     */
    @PostMapping("/catalog/control/updateProductPromoAction")
    public ResponseEntity<Map<String, Object>> updateProductPromoAction(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductPromoCategory
     * <p>service: updateProductPromoCategory  entities: ProductPromoCategory  auth: true
     */
    @PostMapping("/catalog/control/updateProductPromoCategory")
    public ResponseEntity<Map<String, Object>> updateProductPromoCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductPromoCode
     * <p>service: updateProductPromoCode  entities: ProductPromoCode  auth: true
     */
    @PostMapping("/catalog/control/updateProductPromoCode")
    public ResponseEntity<Map<String, Object>> updateProductPromoCode(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductPromo
     * <p>service: updateProductPromoCond  entities: ProductPromoCond  auth: true
     */
    @PostMapping("/catalog/control/updateProductPromoCond")
    public ResponseEntity<Map<String, Object>> updateProductPromoCond(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductPromoProduct
     * <p>service: updateProductPromoProduct  entities: ProductPromoProduct  auth: true
     */
    @PostMapping("/catalog/control/updateProductPromoProduct")
    public ResponseEntity<Map<String, Object>> updateProductPromoProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductPromo
     * <p>service: updateProductPromoRule  entities: ProductPromoRule  auth: true
     */
    @PostMapping("/catalog/control/updateProductPromoRule")
    public ResponseEntity<Map<String, Object>> updateProductPromoRule(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: removeFeatureApplsByFeatureTypeId  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/updateProductQuickAdminDelFeatureTypes")
    public ResponseEntity<Map<String, Object>> removeFeatureApplsByFeatureTypeId(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Product from Quick Admin
     * <p>service: updateProductQuickAdminName  entities: Product  auth: true
     */
    @PostMapping("/catalog/control/updateProductQuickAdminName")
    public ResponseEntity<Map<String, Object>> updateProductQuickAdminName(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateProductQuickAdminSelFeat  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/updateProductQuickAdminSelFeat")
    public ResponseEntity<Map<String, Object>> updateProductQuickAdminSelFeat(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateProductQuickAdminShipping  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/updateProductQuickAdminShipping")
    public ResponseEntity<Map<String, Object>> updateProductQuickAdminShipping(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Updates a product review record
     * <p>service: updateProductReview  entities: ProductReview  auth: true
     */
    @PostMapping("/catalog/control/updateProductReview")
    public ResponseEntity<Map<String, Object>> updateProductReview(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Updates a product review record
     * <p>service: setProductReviewStatus  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/updateProductReviewStatus")
    public ResponseEntity<Map<String, Object>> setProductReviewStatus(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Product Store
     * <p>service: updateProductStore  entities: ProductStore  auth: true
     */
    @PostMapping("/catalog/control/updateProductStore")
    public ResponseEntity<Map<String, Object>> updateProductStore(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ProductStoreCatalog
     * <p>service: updateProductStoreCatalog  entities: ProductStoreCatalog  auth: true
     */
    @PostMapping("/catalog/control/updateProductStoreCatalog")
    public ResponseEntity<Map<String, Object>> updateProductStoreCatalogUpdateProductStoreCatalog(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Product Store Email Setting
     * <p>service: updateProductStoreEmailSetting  entities: ProductStoreEmailSetting  auth: true
     */
    @PostMapping("/catalog/control/updateProductStoreEmail")
    public ResponseEntity<Map<String, Object>> updateProductStoreEmailSetting(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductStoreFacility
     * <p>service: updateProductStoreFacility  entities: ProductStoreFacility  auth: true
     */
    @PostMapping("/catalog/control/updateProductStoreFacility")
    public ResponseEntity<Map<String, Object>> updateProductStoreFacility(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductStoreGroup
     * <p>service: updateProductStoreGroup  entities: ProductStoreGroup  auth: true
     */
    @PostMapping("/catalog/control/updateProductStoreGroup")
    public ResponseEntity<Map<String, Object>> updateProductStoreGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductStoreGroupRollup
     * <p>service: updateProductStoreGroupRollup  entities: ProductStoreGroupRollup  auth: true
     */
    @PostMapping("/catalog/control/updateProductStoreGroupRollup")
    public ResponseEntity<Map<String, Object>> updateProductStoreGroupRollup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Product Store Keyword Override
     * <p>service: updateProductStoreKeywordOvrd  entities: ProductStoreKeywordOvrd  auth: true
     */
    @PostMapping("/catalog/control/updateProductStoreKeywordOvrd")
    public ResponseEntity<Map<String, Object>> updateProductStoreKeywordOvrd(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ProductStorePromoAppl
     * <p>service: updateProductStorePromoAppl  entities: ProductStorePromoAppl  auth: true
     */
    @PostMapping("/catalog/control/updateProductStorePromoAppl")
    public ResponseEntity<Map<String, Object>> updateProductStorePromoApplUpdateProductStorePromoAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductSubscriptionResource Record
     * <p>service: updateProductSubscriptionResource  entities: ProductSubscriptionResource  auth: true
     */
    @PostMapping("/catalog/control/updateProductSubscriptionResource")
    public ResponseEntity<Map<String, Object>> updateProductSubscriptionResource(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductSubscriptionResource Record
     * <p>service: updateProductSubscriptionResource  entities: ProductSubscriptionResource  auth: true
     */
    @PostMapping("/catalog/control/updateProductSubscriptionResourceSr")
    public ResponseEntity<Map<String, Object>> updateProductSubscriptionResourceUpdateProductSubscriptionResourceSr(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateProductKeyword  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/updateProductTag")
    public ResponseEntity<Map<String, Object>> updateProductKeywordUpdateProductTag(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ProductCategoryMember
     * <p>service: updateProductToCategory  entities: ProductCategoryMember  auth: true
     */
    @PostMapping("/catalog/control/updateProductToCategory")
    public ResponseEntity<Map<String, Object>> updateProductToCategoryUpdateProductToCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a QuantityBreak
     * <p>service: updateQuantityBreak  entities: QuantityBreak  auth: true
     */
    @PostMapping("/catalog/control/updateQuantityBreak")
    public ResponseEntity<Map<String, Object>> updateQuantityBreak(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Related URL Content For Product Category
     * <p>service: updateRelatedUrlContentForCategory  entities: ProductCategoryContent  auth: true
     */
    @PostMapping("/catalog/control/updateRelatedUrlContentForCategory")
    public ResponseEntity<Map<String, Object>> updateRelatedUrlContentForCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Updates A ShipmentMethodType
     * <p>service: updateShipmentMethodType  entities: ShipmentMethodType  auth: true
     */
    @PostMapping("/catalog/control/updateShipmentMethodType")
    public ResponseEntity<Map<String, Object>> updateShipmentMethodType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ShipmentTimeEstimate
     * <p>service: updateShipmentTimeEstimate  entities: ShipmentTimeEstimate  auth: true
     */
    @PostMapping("/catalog/control/updateShipmentTimeEstimate")
    public ResponseEntity<Map<String, Object>> updateShipmentTimeEstimate(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Simple Text Content For Product Category
     * <p>service: updateSimpleTextContentForCategory  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/updateSimpleTextContentForCategory")
    public ResponseEntity<Map<String, Object>> updateSimpleTextContentForCategory(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Simple Text Content For Product
     * <p>service: updateSimpleTextContentForProduct  entities: ProductContent  auth: true
     */
    @PostMapping("/catalog/control/updateSimpleTextContentForProduct")
    public ResponseEntity<Map<String, Object>> updateSimpleTextContentForProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Simple Text Content For Product
     * <p>service: updateSimpleTextContentForProductConfigItem  entities: ProdConfItemContent  auth: true
     */
    @PostMapping("/catalog/control/updateSimpleTextContentForProductConfigItem")
    public ResponseEntity<Map<String, Object>> updateSimpleTextContentForProductConfigItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateStatusImageManagement  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/updateStatusImageManagement")
    public ResponseEntity<Map<String, Object>> updateStatusImageManagement(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Subscription Record
     * <p>service: updateSubscription  entities: Subscription  auth: true
     */
    @PostMapping("/catalog/control/updateSubscription")
    public ResponseEntity<Map<String, Object>> updateSubscription(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a SubscriptionResource Record
     * <p>service: updateSubscriptionResource  entities: SubscriptionResource  auth: true
     */
    @PostMapping("/catalog/control/updateSubscriptionResource")
    public ResponseEntity<Map<String, Object>> updateSubscriptionResource(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a SupplierProduct record
     * <p>service: updateSupplierProduct  entities: SupplierProduct  auth: true
     */
    @PostMapping("/catalog/control/updateSupplierProduct")
    public ResponseEntity<Map<String, Object>> updateSupplierProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a SupplierProduct record
     * <p>service: updateSupplierProductFeature  entities: SupplierProductFeature  auth: true
     */
    @PostMapping("/catalog/control/updateSupplierProductFeature")
    public ResponseEntity<Map<String, Object>> updateSupplierProductFeature(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a WorkEffort - Product Assoc, for linking WorkEffort to In or Out Product, for routing it's the link between Manufactured Product with its routings
     * <p>service: updateWorkEffortGoodStandard  entities: WorkEffortGoodStandard  auth: true
     */
    @PostMapping("/catalog/control/updateWorkEffortGoodStandard")
    public ResponseEntity<Map<String, Object>> updateWorkEffortGoodStandard(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: uploadFrame  entities: unknown  auth: true
     */
    @GetMapping("/catalog/control/uploadFrame")
    public ResponseEntity<Map<String, Object>> uploadFrame(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Uses dynamic view entity to find orders; returns a list of Order (OrderHeader) objects
     * <p>service: findOrders  entities: unknown  auth: true
     */
    @PostMapping("/catalog/control/viewProductOrder")
    public ResponseEntity<Map<String, Object>> findOrders(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateShipmentRouteSegment  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/BatchScheduleShipmentRouteSegments")
    public ResponseEntity<Map<String, Object>> updateShipmentRouteSegment(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateShipmentRouteSegment  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/BatchUpdateShipmentRouteSegments")
    public ResponseEntity<Map<String, Object>> updateShipmentRouteSegmentBatchUpdateShipmentRouteSegments(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Clear the current packing session
     * <p>service: clearPackAll  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/ClearPackAll")
    public ResponseEntity<Map<String, Object>> clearPackAll(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Clear a single line from the current packing session
     * <p>service: clearPackLine  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/ClearPackLine")
    public ResponseEntity<Map<String, Object>> clearPackLine(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Complete the packaging set the shipment to PACKED
     * <p>service: completePack  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/CompletePack")
    public ResponseEntity<Map<String, Object>> completePack(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: updateInventoryTransfer  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/CompleteRequestedTransfers")
    public ResponseEntity<Map<String, Object>> updateInventoryTransfer(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Facility
     * <p>service: createFacility  entities: Facility  auth: true
     */
    @PostMapping("/facility/control/CreateFacility")
    public ResponseEntity<Map<String, Object>> createFacility(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Facility Location
     * <p>service: createFacilityLocation  entities: FacilityLocation  auth: true
     */
    @PostMapping("/facility/control/CreateFacilityLocation")
    public ResponseEntity<Map<String, Object>> createFacilityLocation(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an InventoryItem
     * <p>service: createInventoryItem  entities: InventoryItem  auth: true
     */
    @PostMapping("/facility/control/CreateInventoryItem")
    public ResponseEntity<Map<String, Object>> createInventoryItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an inventory transfer. Uses the prepareInventoryTransfer service; see comments there about transfer quantities and inventory items.
     * <p>service: createInventoryTransfer  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/CreateInventoryTransfer")
    public ResponseEntity<Map<String, Object>> createInventoryTransfer(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Pack Multiple Items
     * <p>service: packBulkItems  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/ProcessBulkPackOrder")
    public ResponseEntity<Map<String, Object>> packBulkItems(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Pack Single Item
     * <p>service: packSingleItem  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/ProcessPackOrder")
    public ResponseEntity<Map<String, Object>> packSingleItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: quickScheduleShipmentRouteSegment  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/ScheduleShipmentsWithCarriers")
    public ResponseEntity<Map<String, Object>> quickScheduleShipmentRouteSegment(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Increments the next package sequence
     * <p>service: setNextPackageSeq  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/SetNextPackageSeq")
    public ResponseEntity<Map<String, Object>> setNextPackageSeq(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Facility
     * <p>service: updateFacility  entities: Facility  auth: true
     */
    @PostMapping("/facility/control/UpdateFacility")
    public ResponseEntity<Map<String, Object>> updateFacility(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Facility Location
     * <p>service: updateFacilityLocation  entities: FacilityLocation  auth: true
     */
    @PostMapping("/facility/control/UpdateFacilityLocation")
    public ResponseEntity<Map<String, Object>> updateFacilityLocation(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an InventoryItem
     * <p>service: updateInventoryItem  entities: InventoryItem  auth: true
     */
    @PostMapping("/facility/control/UpdateInventoryItem")
    public ResponseEntity<Map<String, Object>> updateInventoryItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an inventory transfer record
     * <p>service: updateInventoryTransfer  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/UpdateInventoryTransfer")
    public ResponseEntity<Map<String, Object>> updateInventoryTransferUpdateInventoryTransfer(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ShipmentGatewayConfig
     * <p>service: updateShipmentGatewayConfig  entities: ShipmentGatewayConfig  auth: true
     */
    @PostMapping("/facility/control/UpdateShipmentGatewayConfig")
    public ResponseEntity<Map<String, Object>> updateShipmentGatewayConfig(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ShipmentGatewayConfigType
     * <p>service: updateShipmentGatewayConfigType  entities: ShipmentGatewayConfigType  auth: true
     */
    @PostMapping("/facility/control/UpdateShipmentGatewayConfigType")
    public ResponseEntity<Map<String, Object>> updateShipmentGatewayConfigType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add FacilityGroup To FacilityGroup
     * <p>service: addFacilityGroupToGroup  entities: FacilityGroupRollup  auth: true
     */
    @PostMapping("/facility/control/addFacilityGroupToGroup")
    public ResponseEntity<Map<String, Object>> addFacilityGroupToGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Facility To FacilityGroup
     * <p>service: addFacilityToGroup  entities: FacilityGroupMember  auth: true
     */
    @PostMapping("/facility/control/addFacilityToGroup")
    public ResponseEntity<Map<String, Object>> addFacilityToGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Facility To FacilityGroup
     * <p>service: addFacilityToGroup  entities: FacilityGroupMember  auth: true
     */
    @PostMapping("/facility/control/addGroupToFacility")
    public ResponseEntity<Map<String, Object>> addFacilityToGroupAddGroupToFacility(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a FacilityParty record
     * <p>service: addPartyToFacility  entities: FacilityParty  auth: true
     */
    @PostMapping("/facility/control/addPartyToFacility")
    public ResponseEntity<Map<String, Object>> addPartyToFacility(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Add Party To FacilityGroup
     * <p>service: addPartyToFacilityGroup  entities: FacilityGroupRole  auth: true
     */
    @PostMapping("/facility/control/addPartyToFacilityGroup")
    public ResponseEntity<Map<String, Object>> addPartyToFacilityGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: addOrderShipmentToShipment  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/addToShipmentPlan")
    public ResponseEntity<Map<String, Object>> addOrderShipmentToShipment(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Totals package weights and calls the calcShipmentCostEstimate via the PackingSession
     * <p>service: calcPackSessionAdditionalShippingCharge  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/calcPackSessionAdditionalShippingCharge")
    public ResponseEntity<Map<String, Object>> calcPackSessionAdditionalShippingCharge(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Clear the current picking session
     * <p>service: cancelAllRows  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/cancelAllRows")
    public ResponseEntity<Map<String, Object>> cancelAllRows(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Cancel Received Items against a purchase order if received something incorrectly
     * <p>service: cancelReceivedItems  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/cancelReceivedItems")
    public ResponseEntity<Map<String, Object>> cancelReceivedItems(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: checkForceShipmentReceived  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/checkForceShipmentReceived")
    public ResponseEntity<Map<String, Object>> checkForceShipmentReceived(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Complete the packging and set the shipment to packed
     * <p>service: completePackage  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/completePackage")
    public ResponseEntity<Map<String, Object>> completePackage(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Completes a purchase order by cancelling remaining (unreceived) item quantities and generating new product requirements from those quantities
     * <p>service: completePurchaseOrder  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/completePurchaseOrder")
    public ResponseEntity<Map<String, Object>> completePurchaseOrder(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Complete the picking and set the shipment to PICKED
     * <p>service: completeVerifiedPick  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/completeVerifiedPick")
    public ResponseEntity<Map<String, Object>> completeVerifiedPick(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a FacilityContactMech
     * <p>service: createFacilityContactMech  entities: ContactMech, FacilityContactMech  auth: true
     */
    @PostMapping("/facility/control/createContactMech")
    public ResponseEntity<Map<String, Object>> createFacilityContactMech(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an Email Address
     * <p>service: createFacilityEmailAddress  entities: ContactMech, FacilityContactMech  auth: true
     */
    @PostMapping("/facility/control/createEmailAddress")
    public ResponseEntity<Map<String, Object>> createFacilityEmailAddress(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a purpose for facility contact mech
     * <p>service: createFacilityContactMechPurpose  entities: FacilityContactMechPurpose  auth: true
     */
    @PostMapping("/facility/control/createFacilityContactMechPurpose")
    public ResponseEntity<Map<String, Object>> createFacilityContactMechPurpose(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createFacilityContent  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/createFacilityContent")
    public ResponseEntity<Map<String, Object>> createFacilityContent(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Facility Group
     * <p>service: createFacilityGroup  entities: FacilityGroup  auth: true
     */
    @PostMapping("/facility/control/createFacilityGroup")
    public ResponseEntity<Map<String, Object>> createFacilityGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an InventoryItemLabel
     * <p>service: createInventoryItemLabel  entities: InventoryItemLabel  auth: true
     */
    @PostMapping("/facility/control/createInventoryItemLabel")
    public ResponseEntity<Map<String, Object>> createInventoryItemLabel(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an InventoryItemLabelAppl
     * <p>service: createInventoryItemLabelAppl  entities: InventoryItemLabelAppl  auth: true
     */
    @PostMapping("/facility/control/createInventoryItemLabelAppl")
    public ResponseEntity<Map<String, Object>> createInventoryItemLabelAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an InventoryItemLabelAppl
     * <p>service: createInventoryItemLabelAppl  entities: InventoryItemLabelAppl  auth: true
     */
    @PostMapping("/facility/control/createInventoryItemLabelApplFromItem")
    public ResponseEntity<Map<String, Object>> createInventoryItemLabelApplCreateInventoryItemLabelApplFromItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an InventoryItemLabelType
     * <p>service: createInventoryItemLabelType  entities: InventoryItemLabelType  auth: true
     */
    @PostMapping("/facility/control/createInventoryItemLabelType")
    public ResponseEntity<Map<String, Object>> createInventoryItemLabelType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create inventory transfers for the given product and quantity. Return the units not available for transfers.
     * <p>service: createInventoryTransfersForProduct  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/createInventoryTransfersForProduct")
    public ResponseEntity<Map<String, Object>> createInventoryTransfersForProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a PhysicalInventory and an InventoryItemVariance
     * <p>service: createPhysicalInventoryAndVariance  entities: InventoryItemVariance, PhysicalInventory  auth: true
     */
    @PostMapping("/facility/control/createPhysicalInventoryAndVariance")
    public ResponseEntity<Map<String, Object>> createPhysicalInventoryAndVariance(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: createPhysicalInventoryAndVariance  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/createPhysicalVariances")
    public ResponseEntity<Map<String, Object>> createPhysicalInventoryAndVarianceCreatePhysicalVariances(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Picklist From Orders
     * <p>service: createPicklistFromOrders  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/createPicklistFromOrders")
    public ResponseEntity<Map<String, Object>> createPicklistFromOrders(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create PicklistRole
     * <p>service: createPicklistRole  entities: PicklistRole  auth: true
     */
    @PostMapping("/facility/control/createPicklistRole")
    public ResponseEntity<Map<String, Object>> createPicklistRole(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Postal Address
     * <p>service: createFacilityPostalAddress  entities: FacilityContactMech, PostalAddress  auth: true
     */
    @PostMapping("/facility/control/createPostalAddress")
    public ResponseEntity<Map<String, Object>> createFacilityPostalAddress(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Postal Address
     * <p>service: createFacilityPostalAddress  entities: FacilityContactMech, PostalAddress  auth: true
     */
    @PostMapping("/facility/control/createPostalAddressAndPurpose")
    public ResponseEntity<Map<String, Object>> createFacilityPostalAddressCreatePostalAddressAndPurpose(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create an ProductFacilityLocation
     * <p>service: createProductFacilityLocation  entities: ProductFacilityLocation  auth: true
     */
    @PostMapping("/facility/control/createProductFacilityLocation")
    public ResponseEntity<Map<String, Object>> createProductFacilityLocationCreateProductFacilityLocation(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Quick Ships An Entire Order Creating One Shipment Per Facility and Ship Group. All approved order items are automatically issued in full and put into one package. The shipment is created in the INPUT status and then updated to PACKED and SHIPPED.
     * <p>service: quickShipEntireOrder  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/createQuickShipment")
    public ResponseEntity<Map<String, Object>> quickShipEntireOrder(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ShipmentPackageRouteSeg
     * <p>service: createShipmentPackageRouteSeg  entities: ShipmentPackageRouteSeg  auth: true
     */
    @PostMapping("/facility/control/createRouteSegmentShipmentPackage")
    public ResponseEntity<Map<String, Object>> createShipmentPackageRouteSeg(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create Shipment
     * <p>service: createShipment  entities: Shipment  auth: true
     */
    @PostMapping("/facility/control/createShipment")
    public ResponseEntity<Map<String, Object>> createShipment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Return Shipment and ShipmentItems with primaryReturnId
     * <p>service: createShipmentAndItemsForVendorReturn  entities: Shipment  auth: true
     */
    @PostMapping("/facility/control/createShipmentAndItemsForVendorReturn")
    public ResponseEntity<Map<String, Object>> createShipmentAndItemsForVendorReturn(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ShipmentItem
     * <p>service: createShipmentItem  entities: ShipmentItem  auth: true
     */
    @PostMapping("/facility/control/createShipmentItem")
    public ResponseEntity<Map<String, Object>> createShipmentItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ShipmentPackageContent
     * <p>service: createShipmentPackageContent  entities: ShipmentPackageContent  auth: true
     */
    @PostMapping("/facility/control/createShipmentItemPackageContent")
    public ResponseEntity<Map<String, Object>> createShipmentPackageContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ShipmentPackage
     * <p>service: createShipmentPackage  entities: ShipmentPackage  auth: true
     */
    @PostMapping("/facility/control/createShipmentPackage")
    public ResponseEntity<Map<String, Object>> createShipmentPackage(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ShipmentPackageContent
     * <p>service: createShipmentPackageContent  entities: ShipmentPackageContent  auth: true
     */
    @PostMapping("/facility/control/createShipmentPackageContent")
    public ResponseEntity<Map<String, Object>> createShipmentPackageContentCreateShipmentPackageContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ShipmentPackageRouteSeg
     * <p>service: createShipmentPackageRouteSeg  entities: ShipmentPackageRouteSeg  auth: true
     */
    @PostMapping("/facility/control/createShipmentPackageRouteSeg")
    public ResponseEntity<Map<String, Object>> createShipmentPackageRouteSegCreateShipmentPackageRouteSeg(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create ShipmentRouteSegment
     * <p>service: createShipmentRouteSegment  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/createShipmentRouteSegment")
    public ResponseEntity<Map<String, Object>> createShipmentRouteSegment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create a Telecommunications Number
     * <p>service: createFacilityTelecomNumber  entities: FacilityContactMech, TelecomNumber  auth: true
     */
    @PostMapping("/facility/control/createTelecomNumber")
    public ResponseEntity<Map<String, Object>> createFacilityTelecomNumber(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Create or update GeoPoint assigned to facility
     * <p>service: createUpdateFacilityGeoPoint  entities: GeoPoint  auth: true
     */
    @PostMapping("/facility/control/createUpdateFacilityGeoPoint")
    public ResponseEntity<Map<String, Object>> createUpdateFacilityGeoPoint(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a FacilityContactMech
     * <p>service: deleteFacilityContactMech  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/deleteContactMech")
    public ResponseEntity<Map<String, Object>> deleteFacilityContactMech(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete a purpose for facility contact mech
     * <p>service: deleteFacilityContactMechPurpose  entities: FacilityContactMechPurpose  auth: true
     */
    @PostMapping("/facility/control/deleteFacilityContactMechPurpose")
    public ResponseEntity<Map<String, Object>> deleteFacilityContactMechPurpose(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete Content From Facility
     * <p>service: deleteFacilityContent  entities: FacilityContent  auth: true
     */
    @PostMapping("/facility/control/deleteFacilityContent")
    public ResponseEntity<Map<String, Object>> deleteFacilityContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an InventoryItemLabel
     * <p>service: deleteInventoryItemLabel  entities: InventoryItemLabel  auth: true
     */
    @PostMapping("/facility/control/deleteInventoryItemLabel")
    public ResponseEntity<Map<String, Object>> deleteInventoryItemLabel(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an InventoryItemLabelAppl
     * <p>service: deleteInventoryItemLabelAppl  entities: InventoryItemLabelAppl  auth: true
     */
    @PostMapping("/facility/control/deleteInventoryItemLabelAppl")
    public ResponseEntity<Map<String, Object>> deleteInventoryItemLabelAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an InventoryItemLabelAppl
     * <p>service: deleteInventoryItemLabelAppl  entities: InventoryItemLabelAppl  auth: true
     */
    @PostMapping("/facility/control/deleteInventoryItemLabelApplFromItem")
    public ResponseEntity<Map<String, Object>> deleteInventoryItemLabelApplDeleteInventoryItemLabelApplFromItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an InventoryItemLabelType
     * <p>service: deleteInventoryItemLabelType  entities: InventoryItemLabelType  auth: true
     */
    @PostMapping("/facility/control/deleteInventoryItemLabelType")
    public ResponseEntity<Map<String, Object>> deleteInventoryItemLabelType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete the weight, dimensions/shipmentBoxType of package
     * <p>service: deletePackedLine  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/deletePackedLine")
    public ResponseEntity<Map<String, Object>> deletePackedLine(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete PicklistBin
     * <p>service: deletePicklistBin  entities: PicklistBin  auth: true
     */
    @PostMapping("/facility/control/deletePicklistBin")
    public ResponseEntity<Map<String, Object>> deletePicklistBin(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete PicklistItem
     * <p>service: deletePicklistItem  entities: PicklistItem  auth: true
     */
    @PostMapping("/facility/control/deletePicklistItem")
    public ResponseEntity<Map<String, Object>> deletePicklistItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an ProductFacilityLocation
     * <p>service: deleteProductFacilityLocation  entities: ProductFacilityLocation  auth: true
     */
    @PostMapping("/facility/control/deleteProductFacilityLocation")
    public ResponseEntity<Map<String, Object>> deleteProductFacilityLocationDeleteProductFacilityLocation(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ShipmentPackageRouteSeg
     * <p>service: deleteShipmentPackageRouteSeg  entities: ShipmentPackageRouteSeg  auth: true
     */
    @PostMapping("/facility/control/deleteRouteSegmentShipmentPackage")
    public ResponseEntity<Map<String, Object>> deleteShipmentPackageRouteSeg(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ShipmentItem
     * <p>service: deleteShipmentItem  entities: ShipmentItem  auth: true
     */
    @PostMapping("/facility/control/deleteShipmentItem")
    public ResponseEntity<Map<String, Object>> deleteShipmentItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ItemIssuance
     * <p>service: deleteItemIssuance  entities: ItemIssuance  auth: true
     */
    @PostMapping("/facility/control/deleteShipmentItemIssuance")
    public ResponseEntity<Map<String, Object>> deleteItemIssuance(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ShipmentPackageContent
     * <p>service: deleteShipmentPackageContent  entities: ShipmentPackageContent  auth: true
     */
    @PostMapping("/facility/control/deleteShipmentItemPackageContent")
    public ResponseEntity<Map<String, Object>> deleteShipmentPackageContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ShipmentPackage
     * <p>service: deleteShipmentPackage  entities: ShipmentPackage  auth: true
     */
    @PostMapping("/facility/control/deleteShipmentPackage")
    public ResponseEntity<Map<String, Object>> deleteShipmentPackage(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ShipmentPackageContent
     * <p>service: deleteShipmentPackageContent  entities: ShipmentPackageContent  auth: true
     */
    @PostMapping("/facility/control/deleteShipmentPackageContent")
    public ResponseEntity<Map<String, Object>> deleteShipmentPackageContentDeleteShipmentPackageContent(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ShipmentPackageRouteSeg
     * <p>service: deleteShipmentPackageRouteSeg  entities: ShipmentPackageRouteSeg  auth: true
     */
    @PostMapping("/facility/control/deleteShipmentPackageRouteSeg")
    public ResponseEntity<Map<String, Object>> deleteShipmentPackageRouteSegDeleteShipmentPackageRouteSeg(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete ShipmentRouteSegment
     * <p>service: deleteShipmentRouteSegment  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/deleteShipmentRouteSegment")
    public ResponseEntity<Map<String, Object>> deleteShipmentRouteSegment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * DHL Shipment Confirm
     * <p>service: dhlShipmentConfirm  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/dhlShipmentConfirm")
    public ResponseEntity<Map<String, Object>> dhlShipmentConfirm(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Duplicates a shipment route segment and creates the new route segment in the NOT_STARTED status
     * <p>service: duplicateShipmentRouteSegment  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/duplicateShipmentRouteSegment")
    public ResponseEntity<Map<String, Object>> duplicateShipmentRouteSegment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Edit PicklistItem
     * <p>service: editPicklistItem  entities: PicklistItem  auth: true
     */
    @PostMapping("/facility/control/editPicklistItem")
    public ResponseEntity<Map<String, Object>> editPicklistItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Schedule a shipment route segment with FedEx. You will get back a label image and tracking number which are stored for you in the same ShipmentRouteSegment.
     * <p>service: fedexShipRequest  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/fedexShipmentConfirm")
    public ResponseEntity<Map<String, Object>> fedexShipRequest(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Make a unit of measure conversion, first using UomConversionDated, then with UomConversion
     * <p>service: convertUom  entities: UomConversion  auth: true
     */
    @PostMapping("/facility/control/getConvertedPrice")
    public ResponseEntity<Map<String, Object>> convertUom(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Issue an InventoryItem to a Shipment
     * <p>service: issueInventoryItemToShipment  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/issueInventoryItemToShipment")
    public ResponseEntity<Map<String, Object>> issueInventoryItemToShipment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: issueOrderItemShipGrpInvResToShipment  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/issueOrderItemShipGrpInvResToShipment")
    public ResponseEntity<Map<String, Object>> issueOrderItemShipGrpInvResToShipment(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: issueOrderItemToShipment  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/issueOrderItemToShipment")
    public ResponseEntity<Map<String, Object>> issueOrderItemToShipment(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: issueOrderItemToShipment  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/issueOrderItemToShipmentAndReceiveAgainstPO")
    public ResponseEntity<Map<String, Object>> issueOrderItemToShipmentIssueOrderItemToShipmentAndReceiveAgainstPO(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Print pick sheets for orders
     * <p>service: printPickSheets  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/printPickSheets")
    public ResponseEntity<Map<String, Object>> printPickSheets(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Verify Multiple Items
     * <p>service: verifyBulkItem  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/processBulkVerifyPick")
    public ResponseEntity<Map<String, Object>> verifyBulkItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: processPhysicalStockMove  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/processPhysicalStockMove")
    public ResponseEntity<Map<String, Object>> processPhysicalStockMove(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Process a Physical Stock Move from one FacilityLocation to another, in the same Facility. This service will not only move quantities from one InventoryItem to another but it will also reassign any existing OrderItemShipGrpInvRes records to the new InventoryItem.
     * <p>service: processPhysicalStockMove  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/processQuickStockMove")
    public ResponseEntity<Map<String, Object>> processPhysicalStockMoveProcessQuickStockMove(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Verify Single Item
     * <p>service: verifySingleItem  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/processVerifyPick")
    public ResponseEntity<Map<String, Object>> verifySingleItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * DHL Shipment Confirm
     * <p>service: dhlShipmentConfirm  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/quickDhlConfirm")
    public ResponseEntity<Map<String, Object>> dhlShipmentConfirmQuickDhlConfirm(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * The mirror of quickShipEntireOrder, this service automatically creates shipments for an entire purchase order. All order items on each ship group is created as a Shipment. All items on a Shipment are automatically issued to a Package. The shipment's status is first set to CREATED and then set as SHIPPED. The facilityId is used to set the destinationFacilityId of the Shipment.
     * <p>service: quickReceivePurchaseOrder  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/quickReceivePurchaseOrder")
    public ResponseEntity<Map<String, Object>> quickReceivePurchaseOrder(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * UPS Shipment Accept
     * <p>service: upsShipmentAccept  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/quickUpsAccept")
    public ResponseEntity<Map<String, Object>> upsShipmentAccept(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * UPS Shipment Confirm
     * <p>service: upsShipmentConfirm  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/quickUpsConfirm")
    public ResponseEntity<Map<String, Object>> upsShipmentConfirm(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: receiveInventoryProduct  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/receiveInventoryProduct")
    public ResponseEntity<Map<String, Object>> receiveInventoryProduct(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: receiveInventoryProduct  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/receiveInventoryProductsFromShipment")
    public ResponseEntity<Map<String, Object>> receiveInventoryProductReceiveInventoryProductsFromShipment(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: receiveInventoryProduct  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/receiveReturnedProduct")
    public ResponseEntity<Map<String, Object>> receiveInventoryProductReceiveReturnedProduct(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Receive Inventory In Warehouse
     * <p>service: receiveInventoryProduct  entities: InventoryItem, InventoryItemDetail, ShipmentReceipt  auth: true
     */
    @PostMapping("/facility/control/receiveSingleInventoryProduct")
    public ResponseEntity<Map<String, Object>> receiveInventoryProductReceiveSingleInventoryProduct(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Facility From FacilityGroup
     * <p>service: removeFacilityFromGroup  entities: FacilityGroupMember  auth: true
     */
    @PostMapping("/facility/control/removeFacilityFromGroup")
    public ResponseEntity<Map<String, Object>> removeFacilityFromGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove FacilityGroup From FacilityGroup
     * <p>service: removeFacilityGroupFromGroup  entities: FacilityGroupRollup  auth: true
     */
    @PostMapping("/facility/control/removeFacilityGroupFromGroup")
    public ResponseEntity<Map<String, Object>> removeFacilityGroupFromGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Facility From FacilityGroup
     * <p>service: removeFacilityFromGroup  entities: FacilityGroupMember  auth: true
     */
    @PostMapping("/facility/control/removeGroupFromFacility")
    public ResponseEntity<Map<String, Object>> removeFacilityFromGroupRemoveGroupFromFacility(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Delete an OrderShipment and updates the ShipmentItem
     * <p>service: removeOrderShipmentFromShipment  entities: OrderShipment  auth: true
     */
    @PostMapping("/facility/control/removeOrderShipmentFromShipment")
    public ResponseEntity<Map<String, Object>> removeOrderShipmentFromShipment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Party From Facility
     * <p>service: removePartyFromFacility  entities: FacilityParty  auth: true
     */
    @PostMapping("/facility/control/removePartyFromFacility")
    public ResponseEntity<Map<String, Object>> removePartyFromFacility(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Remove Party From FacilityGroup
     * <p>service: removePartyFromFacilityGroup  entities: FacilityGroupRole  auth: true
     */
    @PostMapping("/facility/control/removePartyFromFacilityGroup")
    public ResponseEntity<Map<String, Object>> removePartyFromFacilityGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Save the package(s) information in ShipmentPackage entity from session
     * <p>service: savePackagesInfo  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/savePackagesInfo")
    public ResponseEntity<Map<String, Object>> savePackagesInfo(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Set the weight, dimensions/shipmentBoxType of package in SESSION
     * <p>service: setPackageInfo  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/setPackageInfo")
    public ResponseEntity<Map<String, Object>> setPackageInfo(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ShipmentPackage
     * <p>service: updateShipmentPackage  entities: ShipmentPackage  auth: true
     */
    @PostMapping("/facility/control/setQuickPackageWeight")
    public ResponseEntity<Map<String, Object>> updateShipmentPackage(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ShipmentRouteSegment
     * <p>service: updateShipmentRouteSegment  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/setQuickRouteInfo")
    public ResponseEntity<Map<String, Object>> updateShipmentRouteSegmentSetQuickRouteInfo(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Set Shipment Settings From Primary Order
     * <p>service: setShipmentSettingsFromPrimaryOrder  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/setShipmentSettingsFromPrimaryOrder")
    public ResponseEntity<Map<String, Object>> setShipmentSettingsFromPrimaryOrder(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Complete the packaging set the shipment to packed
     * <p>service: completeShipment  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/shipNow")
    public ResponseEntity<Map<String, Object>> completeShipment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a FacilityContactMech
     * <p>service: updateFacilityContactMech  entities: FacilityContactMech  auth: true
     */
    @PostMapping("/facility/control/updateContactMech")
    public ResponseEntity<Map<String, Object>> updateFacilityContactMech(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an Email Address
     * <p>service: updateFacilityEmailAddress  entities: FacilityContactMech  auth: true
     */
    @PostMapping("/facility/control/updateEmailAddress")
    public ResponseEntity<Map<String, Object>> updateFacilityEmailAddress(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Facility Group
     * <p>service: updateFacilityGroup  entities: FacilityGroup  auth: true
     */
    @PostMapping("/facility/control/updateFacilityGroup")
    public ResponseEntity<Map<String, Object>> updateFacilityGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update FacilityGroup To FacilityGroup Rollup
     * <p>service: updateFacilityGroupToGroup  entities: FacilityGroupRollup  auth: true
     */
    @PostMapping("/facility/control/updateFacilityGroupToGroup")
    public ResponseEntity<Map<String, Object>> updateFacilityGroupToGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Party From Facility
     * <p>service: updateFacilityParty  entities: FacilityParty  auth: true
     */
    @PostMapping("/facility/control/updateFacilityParty")
    public ResponseEntity<Map<String, Object>> updateFacilityParty(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Facility -> Group Member
     * <p>service: updateFacilityToGroup  entities: FacilityGroupMember  auth: true
     */
    @PostMapping("/facility/control/updateFacilityToGroup")
    public ResponseEntity<Map<String, Object>> updateFacilityToGroup(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Facility -> Group Member
     * <p>service: updateFacilityToGroup  entities: FacilityGroupMember  auth: true
     */
    @PostMapping("/facility/control/updateGroupToFacility")
    public ResponseEntity<Map<String, Object>> updateFacilityToGroupUpdateGroupToFacility(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an InventoryItemLabel
     * <p>service: updateInventoryItemLabel  entities: InventoryItemLabel  auth: true
     */
    @PostMapping("/facility/control/updateInventoryItemLabel")
    public ResponseEntity<Map<String, Object>> updateInventoryItemLabel(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an InventoryItemLabelAppl
     * <p>service: updateInventoryItemLabelAppl  entities: InventoryItemLabelAppl  auth: true
     */
    @PostMapping("/facility/control/updateInventoryItemLabelAppl")
    public ResponseEntity<Map<String, Object>> updateInventoryItemLabelAppl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an InventoryItemLabelAppl
     * <p>service: updateInventoryItemLabelAppl  entities: InventoryItemLabelAppl  auth: true
     */
    @PostMapping("/facility/control/updateInventoryItemLabelApplFromItem")
    public ResponseEntity<Map<String, Object>> updateInventoryItemLabelApplUpdateInventoryItemLabelApplFromItem(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an InventoryItemLabelType
     * <p>service: updateInventoryItemLabelType  entities: InventoryItemLabelType  auth: true
     */
    @PostMapping("/facility/control/updateInventoryItemLabelType")
    public ResponseEntity<Map<String, Object>> updateInventoryItemLabelType(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update the weight, dimensions/shipmentBoxType of package
     * <p>service: updatePackedLine  entities: unknown  auth: true
     */
    @PostMapping("/facility/control/updatePackedLine")
    public ResponseEntity<Map<String, Object>> updatePackedLine(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Picklist
     * <p>service: updatePicklist  entities: Picklist  auth: true
     */
    @PostMapping("/facility/control/updatePicklist")
    public ResponseEntity<Map<String, Object>> updatePicklist(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update PicklistBin
     * <p>service: updatePicklistBin  entities: PicklistBin  auth: true
     */
    @PostMapping("/facility/control/updatePicklistBin")
    public ResponseEntity<Map<String, Object>> updatePicklistBin(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Postal Address
     * <p>service: updateFacilityPostalAddress  entities: FacilityContactMech, PostalAddress  auth: true
     */
    @PostMapping("/facility/control/updatePostalAddress")
    public ResponseEntity<Map<String, Object>> updateFacilityPostalAddress(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update an ProductFacilityLocation
     * <p>service: updateProductFacilityLocation  entities: ProductFacilityLocation  auth: true
     */
    @PostMapping("/facility/control/updateProductFacilityLocation")
    public ResponseEntity<Map<String, Object>> updateProductFacilityLocationUpdateProductFacilityLocation(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ShipmentPackageRouteSeg
     * <p>service: updateShipmentPackageRouteSeg  entities: ShipmentPackageRouteSeg  auth: true
     */
    @PostMapping("/facility/control/updateRouteSegmentShipmentPackage")
    public ResponseEntity<Map<String, Object>> updateShipmentPackageRouteSeg(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update Shipment
     * <p>service: updateShipment  entities: Shipment  auth: true
     */
    @PostMapping("/facility/control/updateShipment")
    public ResponseEntity<Map<String, Object>> updateShipment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ShipmentGatewayDhl record
     * <p>service: updateShipmentGatewayDhl  entities: ShipmentGatewayDhl  auth: true
     */
    @PostMapping("/facility/control/updateShipmentGatewayDhl")
    public ResponseEntity<Map<String, Object>> updateShipmentGatewayDhl(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ShipmentGatewayFedex record
     * <p>service: updateShipmentGatewayFedex  entities: ShipmentGatewayFedex  auth: true
     */
    @PostMapping("/facility/control/updateShipmentGatewayFedex")
    public ResponseEntity<Map<String, Object>> updateShipmentGatewayFedex(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ShipmentGatewayUps
     * <p>service: updateShipmentGatewayUps  entities: ShipmentGatewayUps  auth: true
     */
    @PostMapping("/facility/control/updateShipmentGatewayUps")
    public ResponseEntity<Map<String, Object>> updateShipmentGatewayUps(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a ShipmentGatewayUsps
     * <p>service: updateShipmentGatewayUsps  entities: ShipmentGatewayUsps  auth: true
     */
    @PostMapping("/facility/control/updateShipmentGatewayUsps")
    public ResponseEntity<Map<String, Object>> updateShipmentGatewayUsps(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ShipmentPackage
     * <p>service: updateShipmentPackage  entities: ShipmentPackage  auth: true
     */
    @PostMapping("/facility/control/updateShipmentPackage")
    public ResponseEntity<Map<String, Object>> updateShipmentPackageUpdateShipmentPackage(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ShipmentPackageRouteSeg
     * <p>service: updateShipmentPackageRouteSeg  entities: ShipmentPackageRouteSeg  auth: true
     */
    @PostMapping("/facility/control/updateShipmentPackageRouteSeg")
    public ResponseEntity<Map<String, Object>> updateShipmentPackageRouteSegUpdateShipmentPackageRouteSeg(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update ShipmentRouteSegment
     * <p>service: updateShipmentRouteSegment  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/updateShipmentRouteSegment")
    public ResponseEntity<Map<String, Object>> updateShipmentRouteSegmentUpdateShipmentRouteSegment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Update a Telecommunications Number
     * <p>service: updateFacilityTelecomNumber  entities: FacilityContactMech, TelecomNumber  auth: true
     */
    @PostMapping("/facility/control/updateTelecomNumber")
    public ResponseEntity<Map<String, Object>> updateFacilityTelecomNumber(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * UPS Shipment Accept
     * <p>service: upsShipmentAccept  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/upsShipmentAccept")
    public ResponseEntity<Map<String, Object>> upsShipmentAcceptUpsShipmentAccept(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * UPS Shipment Confirm
     * <p>service: upsShipmentConfirm  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/upsShipmentConfirm")
    public ResponseEntity<Map<String, Object>> upsShipmentConfirmUpsShipmentConfirm(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * UPS Track Shipment
     * <p>service: upsTrackShipment  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/upsTrackShipment")
    public ResponseEntity<Map<String, Object>> upsTrackShipment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * UPS Void Shipment
     * <p>service: upsVoidShipment  entities: ShipmentRouteSegment  auth: true
     */
    @PostMapping("/facility/control/upsVoidShipment")
    public ResponseEntity<Map<String, Object>> upsVoidShipment(@RequestBody Map<String, Object> body) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: viewShipmentPackageRouteSegLabelImage  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/viewShipmentLabel")
    public ResponseEntity<Map<String, Object>> viewShipmentPackageRouteSegLabelImage(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * No description.
     * <p>service: viewShipmentPackageRouteSegLabelImage  entities: unknown  auth: true
     */
    @GetMapping("/facility/control/viewShipmentPackageRouteSegLabelImage")
    public ResponseEntity<Map<String, Object>> viewShipmentPackageRouteSegLabelImageViewShipmentPackageRouteSegLabelImage(@RequestParam Map<String, String> params) {
        // TODO
        throw new UnsupportedOperationException();
    }
}
