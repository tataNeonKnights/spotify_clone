import React, { useContext, useEffect } from "react";
import HeroPage from "./HeroPage";
import NewMusicPlaylist from "./NewMusicPlaylist";
import TrendingPlaylists from "./TrendingPlaylists";
import ArtistsCardsHome from "./ArtistsCardsHome";
import PopularPlaylists from "./PopularPlaylists";

import NewSongs from "./NewSongs";
import SongsContext from "../Memory/SongsContext";


export default function Home() {
  
  const {getSongs}=useContext(SongsContext);
  console.log("this is getsongs",getSongs)
 useEffect(()=>{
getSongs();
  
},[])

  try {
    return (
      <>
        <HeroPage />
        <NewMusicPlaylist />
        <NewSongs />
        <TrendingPlaylists />
        <ArtistsCardsHome />
        <PopularPlaylists />
      </>
    );
  } catch (error) {
    console.log("some error occured");
  }
}
