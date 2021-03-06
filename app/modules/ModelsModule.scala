package modules

import com.google.inject.AbstractModule
import models.{TokenRepo, TokenRepoImpl, UserRepo, UserRepoImpl}
import net.codingwell.scalaguice.ScalaModule

class ModelsModule extends AbstractModule with ScalaModule {
  override def configure(): Unit = {
    bind[UserRepo].to[UserRepoImpl]
    bind[TokenRepo].to[TokenRepoImpl]
  }
}
