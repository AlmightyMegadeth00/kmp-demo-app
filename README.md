This is a Kotlin Multiplatform project targeting Android, iOS, Desktop.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.  Android's main source is located here.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.

<img width="399" alt="Screenshot 2025-02-16 at 7 33 27 PM" src="https://github.com/user-attachments/assets/ff5a793d-10c8-4638-bdd2-f57e969285ae" />
<img width="408" alt="Screenshot 2025-02-16 at 7 33 06 PM" src="https://github.com/user-attachments/assets/3d0e3ad6-fdb4-4d3a-bb21-f7a7b498bdbc" />
<img width="315" alt="Screenshot 2025-02-16 at 7 35 18 PM" src="https://github.com/user-attachments/assets/085012bc-bd01-4139-a3c3-b419d74292e7" />
<img width="316" alt="Screenshot 2025-02-16 at 7 35 29 PM" src="https://github.com/user-attachments/assets/dc3dd103-a02c-4402-8c18-2418c27015d9" />
