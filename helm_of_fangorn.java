// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class helm_of_fangorn_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "helm_of_fangorn_converted"), "main");
	private final ModelPart Helm;
	private final ModelPart Leaves;

	public helm_of_fangorn_Converted(ModelPart root) {
		this.Helm = root.getChild("Helm");
		this.Leaves = root.getChild("Leaves");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Helm = partdefinition.addOrReplaceChild("Helm", CubeListBuilder.create().texOffs(0, 0).addBox(-15.0F, -11.0F, 1.0F, 13.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(0, 31).addBox(-16.0F, -10.0F, 1.0F, 1.0F, 7.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(25, 18).addBox(-2.0F, -10.0F, 1.0F, 1.0F, 7.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(45, 50).addBox(-15.0F, -10.0F, 0.0F, 13.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 42).addBox(-15.0F, -10.0F, 14.0F, 13.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 57).addBox(-16.0F, -10.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-16.0F, -10.0F, 14.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(47, 0).addBox(-2.0F, -10.0F, 14.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 0).addBox(-2.0F, -10.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 15).addBox(-16.0F, -11.0F, 1.0F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(39, 1).addBox(-2.0F, -11.0F, 1.0F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(53, 33).addBox(-15.0F, -11.0F, 14.0F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 15).addBox(-15.0F, -11.0F, 0.0F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(39, 0).addBox(-10.0F, -11.0F, 15.0F, 3.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(15, 31).addBox(-10.0F, -12.0F, -1.0F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 38).addBox(-17.0F, -8.0F, -0.99F, 17.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(54, 56).addBox(-17.0F, -8.0F, 0.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(55, 15).addBox(-1.0F, -8.0F, 0.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 14).addBox(-10.0F, -12.0F, 0.0F, 3.0F, 1.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(46, 17).addBox(-17.0F, -5.0F, 4.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(21, 40).addBox(-1.0F, -2.0F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(6, 40).addBox(-17.0F, -2.0F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(40, 17).addBox(-1.0F, -5.0F, 4.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(54, 0).addBox(-12.1522F, -10.2346F, 20.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 24.0F, -8.0F));

		PartDefinition cube_r1 = Helm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 53).addBox(-9.0F, 0.0F, 0.0F, 11.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.0F, -9.0F, 12.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r2 = Helm.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(53, 29).addBox(-2.0F, -2.0F, 0.0F, 11.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.0F, 4.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r3 = Helm.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -10.0F, 0.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.1522F, -10.2346F, 2.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r4 = Helm.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(15, 38).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1522F, -8.2346F, 14.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Helm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(38, 54).addBox(-2.0F, -13.0F, 0.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.1522F, -10.2346F, 8.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r6 = Helm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(54, 4).addBox(0.0F, -3.0F, 0.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1522F, -7.2346F, 18.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r7 = Helm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(46, 56).addBox(-2.0F, -13.0F, 0.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1522F, -10.2346F, 8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition Leaves = partdefinition.addOrReplaceChild("Leaves", CubeListBuilder.create().texOffs(22, 25).addBox(-22.5F, 1.75F, 15.75F, 2.5F, 2.5F, 2.5F, new CubeDeformation(0.0F))
		.texOffs(0, 22).addBox(-3.0F, -3.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(17.0F, 12.0F, -4.0F));

		PartDefinition cube_r8 = Leaves.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 14).addBox(-3.0F, -1.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-34.0F, 0.0F, 8.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r9 = Leaves.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 31).addBox(-3.25F, -4.25F, -1.25F, 3.5F, 4.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.25F, -6.0F, -1.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r10 = Leaves.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(22, 17).addBox(-3.25F, -1.25F, -1.25F, 4.5F, 4.5F, 4.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.25F, 0.0F, 19.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Leaves.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(22, 53).addBox(-3.25F, -3.25F, -1.25F, 4.5F, 4.5F, 4.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-26.25F, -10.0F, 4.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r12 = Leaves.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(30, 25).addBox(-0.25F, -2.25F, -0.25F, 2.5F, 2.5F, 2.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.25F, 2.0F, 14.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r13 = Leaves.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 38).addBox(-2.25F, -2.25F, -0.25F, 2.5F, 2.5F, 2.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.25F, -10.0F, 4.0F, 0.0F, 0.0F, 0.3927F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Helm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leaves.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}