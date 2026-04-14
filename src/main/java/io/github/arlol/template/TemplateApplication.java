package io.github.arlol.template;

public class TemplateApplication {

	public static void main(String[] args) {
		if (args.length == 1 && "--version".equals(args[0])) {
			Package pkg = TemplateApplication.class.getPackage();
			String title = pkg.getImplementationTitle();
			String version = pkg.getImplementationVersion();
			System.out.println(title + " version \"" + version + "\"");
			return;
		}
		System.out.println("Hello, world");
	}

}
