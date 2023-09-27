// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class fangornHelm extends ModelBase {
	private final ModelRenderer Helm;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer Leaves;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;

	public fangornHelm() {
		textureWidth = 128;
		textureHeight = 128;

		Helm = new ModelRenderer(this);
		Helm.setRotationPoint(8.0F, 24.0F, -8.0F);
		Helm.cubeList.add(new ModelBox(Helm, 0, 0, -15.0F, -11.0F, 1.0F, 13, 1, 13, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 0, 31, -16.0F, -10.0F, 1.0F, 1, 7, 13, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 25, 18, -2.0F, -10.0F, 1.0F, 1, 7, 13, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 45, 50, -15.0F, -10.0F, 0.0F, 13, 5, 1, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 32, 42, -15.0F, -10.0F, 14.0F, 13, 7, 1, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 4, 57, -16.0F, -10.0F, 0.0F, 1, 7, 1, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 0, 57, -16.0F, -10.0F, 14.0F, 1, 7, 1, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 47, 0, -2.0F, -10.0F, 14.0F, 1, 7, 1, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 8, 0, -2.0F, -10.0F, 0.0F, 1, 7, 1, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 40, 15, -16.0F, -11.0F, 1.0F, 1, 1, 13, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 39, 1, -2.0F, -11.0F, 1.0F, 1, 1, 13, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 53, 33, -15.0F, -11.0F, 14.0F, 13, 1, 1, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 22, 15, -15.0F, -11.0F, 0.0F, 13, 1, 1, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 39, 0, -10.0F, -11.0F, 15.0F, 3, 9, 1, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 15, 31, -10.0F, -12.0F, -1.0F, 3, 10, 1, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 32, 38, -17.0F, -8.0F, -0.99F, 17, 3, 1, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 54, 56, -17.0F, -8.0F, 0.0F, 1, 3, 6, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 55, 15, -1.0F, -8.0F, 0.0F, 1, 3, 6, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 0, 14, -10.0F, -12.0F, 0.0F, 3, 1, 16, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 46, 17, -17.0F, -5.0F, 4.0F, 1, 5, 2, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 21, 40, -1.0F, -2.0F, 2.0F, 1, 2, 2, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 6, 40, -17.0F, -2.0F, 2.0F, 1, 2, 2, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 40, 17, -1.0F, -5.0F, 4.0F, 1, 5, 2, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 54, 0, -12.1522F, -10.2346F, 20.0F, 8, 2, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-17.0F, -9.0F, 12.0F);
		Helm.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3927F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 53, -9.0F, 0.0F, 0.0F, 11, 2, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -9.0F, 4.0F);
		Helm.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.3927F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 53, 29, -2.0F, -2.0F, 0.0F, 11, 2, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-6.1522F, -10.2346F, 2.0F);
		Helm.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.3927F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -2.0F, -10.0F, 0.0F, 2, 10, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-3.1522F, -8.2346F, 14.0F);
		Helm.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.3927F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 38, -2.0F, 0.0F, 0.0F, 2, 2, 13, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-12.1522F, -10.2346F, 8.0F);
		Helm.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.3927F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 38, 54, -2.0F, -13.0F, 0.0F, 2, 13, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.1522F, -7.2346F, 18.0F);
		Helm.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.3927F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 54, 4, 0.0F, -3.0F, 0.0F, 8, 2, 2, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-3.1522F, -10.2346F, 8.0F);
		Helm.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.3927F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 46, 56, -2.0F, -13.0F, 0.0F, 2, 13, 2, 0.0F, false));

		Leaves = new ModelRenderer(this);
		Leaves.setRotationPoint(17.0F, 12.0F, -4.0F);
		Leaves.cubeList.add(new ModelBox(Leaves, 22, 25, -22.5F, 1.75F, 15.75F, 2, 2, 2, 0.0F, false));
		Leaves.cubeList.add(new ModelBox(Leaves, 0, 22, -3.0F, -3.0F, -1.0F, 4, 4, 4, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-34.0F, 0.0F, 8.0F);
		Leaves.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 14, -3.0F, -1.0F, -1.0F, 4, 4, 4, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-11.25F, -6.0F, -1.0F);
		Leaves.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.3927F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 31, -3.25F, -4.25F, -1.25F, 3, 4, 3, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-12.25F, 0.0F, 19.0F);
		Leaves.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.3927F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 17, -3.25F, -1.25F, -1.25F, 4, 4, 4, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-26.25F, -10.0F, 4.0F);
		Leaves.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.3927F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 22, 53, -3.25F, -3.25F, -1.25F, 4, 4, 4, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-5.25F, 2.0F, 14.0F);
		Leaves.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.3927F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 30, 25, -0.25F, -2.25F, -0.25F, 2, 2, 2, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-7.25F, -10.0F, 4.0F);
		Leaves.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.3927F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 38, -2.25F, -2.25F, -0.25F, 2, 2, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Helm.render(f5);
		Leaves.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}