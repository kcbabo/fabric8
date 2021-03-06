/**
 *  Copyright 2005-2014 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package io.fabric8.docker.provider.customizer;

/**
 * The various configuration options when creating a custom docker image
 */
public class CustomDockerContainerImageOptions {
    private final String baseImage;
    private final String imageRepository;
    private final String newImageName;
    private final String javaLibraryPath;
    private final String javaDeployPath;
    private final String homePath;
    private final String entryPoint;
    private final String overlayFolder;
    private final boolean mavenJavaLibraryPathLayout;

    public CustomDockerContainerImageOptions(String baseImage, String imageRepository, String newImageName, String javaLibraryPath, String javaDeployPath, String homePath, String entryPoint, String overlayFolder, boolean mavenJavaLibraryPathLayout) {
        this.baseImage = baseImage;
        this.imageRepository = imageRepository;
        this.newImageName = newImageName;
        this.javaLibraryPath = javaLibraryPath;
        this.javaDeployPath = javaDeployPath;
        this.homePath = homePath;
        this.entryPoint = entryPoint;
        this.overlayFolder = overlayFolder;
        this.mavenJavaLibraryPathLayout = mavenJavaLibraryPathLayout;
    }

    public String getBaseImage() {
        return baseImage;
    }

    public String getImageRepository() {
        return imageRepository;
    }

    /**
     * The tag name of the newly created image
     */
    public String getNewImageName() {
        return newImageName;
    }

    /**
     * Returns the path where java shared libraries are to be copied
     */
    public String getJavaLibraryPath() {
        return javaLibraryPath;
    }

    /**
     * Returns true if the java library path uses a flat folder; versus a maven style layout
     */
    public boolean isMavenJavaLibraryPathLayout() {
        return mavenJavaLibraryPathLayout;
    }

    /**
     * Returns the path where java deployment units (WARs etc) are to be copied
     */
    public String getJavaDeployPath() {
        return javaDeployPath;
    }

    /**
     * Returns the home directory where things get installed and we apply any overlay files to
     */
    public String getHomePath() {
        return homePath;
    }

    /**
     * The image entry point command
     */
    public String getEntryPoint() {
        return entryPoint;
    }

    public String getOverlayFolder() {
        return overlayFolder;
    }

}
